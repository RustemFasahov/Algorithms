public class Array {
    private int[] arr;
    private int length;

    public Array(int length) {
        arr = new int[length];
        this.length = 0;
    }

    public int getLength(){
        return length;
    }

    public void insert (int value){
        int i;
        for (i = 0; i < length; i++) {
            if(arr[i]>value) break;
        }
        for (int j = length; j > i ; j--) {
            arr[j] = arr[j-1];
        }
        arr[i] = value;
        length ++;
    }

    public void delete (int value){
        int i;
        boolean haveValue = false;
        for (i = 0; i < length; i++) {
            if(arr[i] == value) {
                haveValue = true;
                break;
            }
        }
        for (int j = i; j < length - 1; j++) {
            arr[j] = arr[j + 1];
        }
        if(haveValue == true) length--;
    }

    public void print(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean binarySeach(int value){
        int low = 0;
        int high = this.arr.length - 1;
        int mid;

        while (low <= high){
            mid = (low + high) / 2;
            if(value == this.arr[mid])return true;
            else {
                if (value < arr[mid]) high = mid - 1;
                else low = mid + 1;
            }
        }
        return false;
    }

    public boolean linearSeach(int value){
        for (int i = 0; i < length; i++) {
            if (value == arr[i]) return true;
        }
        return false;
    }

    public void sortBubble(){
        int out, in;
        for (out = this.length - 1; out >= 1; out--) {
            for(in = 0; in < out; in++) {
                if (this.arr[in] > this.arr[in + 1]) {
                    change(in, in + 1);
                }
            }
        }
    }

    public void sortSelect(){
        int out, in, mark;
        for(out = 0; out < arr.length; out ++){
            mark = out;
            for(in = out + 1; in < arr.length; in ++){
                if (this.arr[in] < this.arr[mark]){
                    mark = in;
                }
            }
            change(out, mark);
        }
    }

    public void sortInsert(){
        int in, out;
        for(out = 1;out < arr.length; out++){
            int temp = this.arr[out];
            in = out;
            while(in > 0 && this.arr[in-1] >=temp){
                this.arr[in] = this.arr[in-1];
                --in;
            }
            this.arr[in] = temp;
        }
    }

    public void setArr(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            length++;
        }
    }

    private void change(int a, int b){
        int tmp = this.arr[a];
        this.arr[a] = this.arr[b];
        this.arr[b] = tmp;
    }



}
