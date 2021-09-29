package S181860072;

public class QuickSorter implements Sorter {
    private String plan = "";
    private int[] a;

    QuickSorter() {
        this.a = null;
    }

    @Override
    public void load(int[] elements) {
        this.a = elements;
    }

    @Override
    public void sort() {
        quickSortExeute(0, a.length-1);
    }

    private void quickSortExeute(int left,int right){
        if(right-left<1){
            return;
        }
        else{
            int pointer = left;
            int aim=right;
            while(pointer!=aim){
                if(pointer<aim){
                    if(a[pointer]>a[aim]){
                        swap(pointer, aim);
                        int temp=pointer;
                        pointer=aim;
                        aim=temp;
                        aim++;
                    }
                    else{
                        aim--;
                    }
                }
                else{
                    if(a[pointer]<a[aim]){
                        swap(pointer, aim);
                        int temp=pointer;
                        pointer=aim;
                        aim=temp;
                        aim--;
                    }
                    else{
                        aim++;
                    }
                }
            }
            quickSortExeute(left, pointer-1);
            quickSortExeute(pointer+1, right);
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
