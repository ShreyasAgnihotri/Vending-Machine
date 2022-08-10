public class Machine {
    private Items[][] items;
    public Machine(Items[][] items){
        this.items = new Items[items.length][items[0].length];
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                this.items[i][j] = new Items(items[i][j]);
            }
        }
    }
    public Items getItems(int row,int col){
        return new Items(this.items[row][col]);
    }
    public void setItems(Items item, int row, int col){
        this.items[row][col] = new Items(item);
    }
    public boolean dispense(int row,int col){
        if(this.items[row][col].getQuantity()>0){
            this.items[row][col].setQuantity(this.items[row][col].getQuantity() - 1);
            return true;
        }
        return false;
    }
    public String toString(){
        String temp = "";
        temp+="\n\n\t************************************\n";
        for (int i = 0; i < items.length; i++) {
            temp+="\t";
            for (int j = 0; j < items[i].length; j++) {
                temp+= " " + this.items[i][j].toString();                
            }
            temp+="\n\n";
        }
        temp+="\t*************************************";
        return temp;
    }
}
