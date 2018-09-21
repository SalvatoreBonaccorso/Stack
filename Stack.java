public class Stack {
    private int[] array;
    private int level = 0;

    public Stack(int size) {
        this.array = new int[size];
    }

    public void push(int x) {   //inseriamo gli elementi solo da un lato
        if (!this.isFull()) {
            this.array[level] = x;
            this.level++;
        }
    }

    public void shift(int newValue){
        for(int i=array.length-1;i>0;i--){
            array[i]=array[i-1];
        }
        array[0]=newValue;   // assegniamo la prima posizione dell'array
    }
    public void unShift(int newValue){
        for(int i=0;i<array.length-1;i++){
            array[i]=array[i+1];
        }
        array[array.length-1]=newValue;  // assegniamo la dimensione massima dell'array
    }

    public void pop() {    // estraiamo gli elementi solo da un lato
        if (this.level > 0) {
            this.array[this.level - 1] = 0;
            this.level--;
        }
    }

    public boolean isFull(){

        return this.level == this.array.length;
    }
    public void print(){
        System.out.print("\nLa pila attualmente è composta dai numeri : ");
        for(int i=0;i < array.length;i++) System.out.print(array[i]+" ");
    }
}
