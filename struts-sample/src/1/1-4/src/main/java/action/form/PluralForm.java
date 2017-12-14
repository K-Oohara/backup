
package action.form;

import java.util.ArrayList;
import java.util.List;

import model.DataModel;

import org.apache.struts.action.ActionForm;

public class PluralForm extends ActionForm {
	private List<DataModel> data = new ArrayList<DataModel>();
	
	public List<DataModel> getAllData() {
		return data;
	}

	public void setData(List<DataModel> values) {
		data = values;
	}

	public DataModel getData(int idx) {
       //1)入力された値を取り出す時もこのメソッドが利用される
	    while (data.size() <= idx) {
		    this.data.add(new DataModel());
	   }
	   return data.get(idx);
    }

}
