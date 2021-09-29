package S181860072;

public class SelectSorter implements Sorter {
    private String plan = "";
    private int[] a;

    
    SelectSorter() {
        this.a = null;
    }

    @Override
    public void load(int[] elements) {
        this.a=elements;
    }

    @Override
    public void sort() {
        int start=0;
        while(start<a.length-1){
            int maxIndex=start;
            for(int i=start;i<a.length;i++){
                if(a[i]<a[maxIndex]){
                    maxIndex=i;
                }
            }
            if(maxIndex!=start){
                swap(maxIndex, start);
            }
            start++;
        }
    }

    @Override
    public String getPlan() {
        return this.plan;
    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }
}
