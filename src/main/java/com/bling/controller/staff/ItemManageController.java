package com.bling.controller.staff;

import com.bling.pojo.Item;
import com.bling.service.ICategoryService;
import com.bling.service.IFileService;
import com.bling.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * created by leinan
 */
@Controller
@RequestMapping(value = "/staff/item/")
public class ItemManageController {
    @Autowired
    private IItemService iItemService;
    @Autowired
    private IFileService iFileService;
    @Autowired
    private ICategoryService iCategoryService;


    /*添加商品
    * @param:item,img……
    * return添加完成后的商品信息*/
    @RequestMapping(value = "add_item1.do")
    public String add_item1( Model model, HttpSession session)throws Exception{
        ArrayList result = iCategoryService.getCategoryList();
        model.addAttribute("clist",result);
        return "staff/item/add_item";
    }
    @RequestMapping(value = "add_item2.do")
    public String add_item2(HttpServletRequest request, Item item, @RequestParam("mainimg1") MultipartFile mainimg1, @RequestParam("mainimg2") MultipartFile mainimg2,
                           @RequestParam("subimg") MultipartFile submig, @RequestParam("dresserimg") MultipartFile dresserimg, Model model, HttpSession session)throws Exception{
        String path = request.getServletContext().getRealPath("picture");
        try {
            item.setMainImage(iFileService.saveImg(path+"/main/"+item.getCategoryId(),mainimg1)+','+iFileService.saveImg(path+"/main/"+item.getCategoryId(),mainimg2));
            item.setSubImages(iFileService.saveImg(path+"/sub/"+item.getCategoryId(),submig));
            item.setDresserImages(iFileService.saveImg(path+"/dresser/"+item.getCategoryId(),dresserimg));
            boolean response=iItemService.addItem(item);
            if(response==true) {
                double price=(double)item.getPrice()/100;
                model.addAttribute("item", item);
                model.addAttribute("price", price);
                String[] mainImgList = item.getMainImage().split(",");
                model.addAttribute("mainImgList", mainImgList);
            }else{
                session.setAttribute("serviceError","添加商品失败");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(item.getSubImages()+"????????");
        return "staff/item/item_info_unchange1";
    }

    /*商品列表1
     * return所有品类的导航*/
    @RequestMapping(value = "item_list1.do")
    public String item_list1( Model model, HttpSession session)throws Exception{
        ArrayList result = iCategoryService.getCategoryList();
        model.addAttribute("clist",result);
        return "staff/item/item_list1";
    }
    /*商品列表2
     * 返回该品类下的Item
     * */
    @RequestMapping(value = "item_list2.do")
    public String item_list2(int categoryId, HttpSession session, Model model){
        ArrayList<com.bling.model.Item> result =iItemService.getItemListByCategoryId(categoryId);
        model.addAttribute("item_list",result);
        return "staff/item/item_list2";
    }

    /*查看id为id的某item信息*/
    @RequestMapping(value = "item_info_by_id.do")
    public String item_info_by_id(int id, HttpSession session, Model model){
        com.bling.model.Item item =iItemService.getItemInfoById(id);
        model.addAttribute("item",item);
        return "staff/item/item_info_unchange2";
    }

    /*更新id为id的item信息*/
    @RequestMapping(value = "update_item1.do")
    public String update_item1(int id,HttpSession session, Model model){
        ArrayList clist = iCategoryService.getCategoryList();
        model.addAttribute("clist",clist);
        com.bling.model.Item item =iItemService.getItemInfoById(id);
        model.addAttribute("item",item);
        return "staff/item/update_item_info";
    }
    @RequestMapping(value = "update_item2.do")
    public String update_item2(HttpServletRequest request,Item item,HttpSession session,@RequestParam("mainimg1") MultipartFile mainimg1, @RequestParam("mainimg2") MultipartFile mainimg2,
                              @RequestParam("subimg") MultipartFile submig, @RequestParam("dresserimg") MultipartFile dresserimg, Model model){
        String path = request.getServletContext().getRealPath("picture");
        try {
            item.setMainImage(iFileService.saveImg(path+"/main/"+item.getCategoryId(),mainimg1)+','+iFileService.saveImg(path+"/main/"+item.getCategoryId(),mainimg2));
            item.setSubImages(iFileService.saveImg(path+"/sub/"+item.getCategoryId(),submig));
            item.setDresserImages(iFileService.saveImg(path+"/dresser/"+item.getCategoryId(),dresserimg));
            boolean response=iItemService.updateItemById(item);
            if(response==true) {
                double price=(double)item.getPrice()/100;
                model.addAttribute("item", item);
                model.addAttribute("price", price);
                String[] mainImgList = item.getMainImage().split(",");
                model.addAttribute("mainImgList", mainImgList);
            }else{
                session.setAttribute("serviceError","更新商品失败");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "staff/item/item_info_unchange1";
    }


}
