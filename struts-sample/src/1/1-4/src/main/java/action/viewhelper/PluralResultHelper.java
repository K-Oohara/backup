
package action.viewhelper;

import model.DataModel;

public class PluralResultHelper {
    //DataModelクラスを内包して表示を助けるクラス
    private DataModel data;
    private boolean isChange;

    public DataModel getData() {
        return data;
    }

    public boolean getChange() {
        return isChange;
    }

    public void setData(DataModel data) {
        this.data = data;
    }

    public void setChange(boolean change) {
        isChange = change;
    }

}
