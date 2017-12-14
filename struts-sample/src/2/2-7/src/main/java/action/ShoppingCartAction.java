
package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CartItem;
import model.Product;
import model.ShoppingCart;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.ProductDAOUtil;

public class ShoppingCartAction extends Action{
    
    public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception{
        
        HttpSession session = request.getSession();
        
        //セッションから取り出せない場合はデータベースから取得
        ProductDAOUtil util = new ProductDAOUtil();
        Product pro = util.getProductById(form, session);
        if(pro == null){
            pro = util.getProductById(form);
        }

        //ショッピングカートを取得        
        ShoppingCart cart = (ShoppingCart)session.getAttribute("cart");
        
        if(cart == null){
            cart = new ShoppingCart();
            session.setAttribute("cart",cart);
        }
        
        //指定された商品がすでにあるかどうかを判定        
        CartItem item = cart.getItem(pro.getId());
        if(item == null){
            cart.addItem(pro,1); 
        }else{
            //指定された商品があった場合は購入数量を一つ増やす        
            int count = item.getCount();
            count++;
            item.setCount(count);
        }
        
       //1)複数回購入防止するためにsaveToken()をする   
         saveToken(request);
        
       return mapping.findForward("cart");
    }
}
