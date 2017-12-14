
package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ShoppingCart;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

import dao.ShoppingDAO;

public class CommitCartAction extends Action {
    public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception{
        
        //1)不正なリクエストがおこっているか判定する
        if(!isTokenValid(request,true)){
           return mapping.findForward("twice"); 
        }
        
        //ユーザIDの取り出し
        DynaActionForm dForm = (DynaActionForm)form;
        String uid = (String) dForm.get("userid");
        
        //ショッピングカートの取り出し
        ShoppingCart cart = (ShoppingCart)request.getSession().getAttribute("cart");
        
        //買い物情報の登録
        ShoppingDAO dao = new ShoppingDAO();
        dao.purchaseCart(uid,cart);
        
        cart.clear();
        return mapping.findForward("success");
    }
}
