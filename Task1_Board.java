package Task1;

public class Board {
    private Shape[] list = new Shape[4];

    public void draw(int index, Shape figure){
        list[index - 1] = figure;
    }

    public void eraseIndex(int index){
        list[index - 1] = null;
    }

    public void printInfo(){
        double totalArea = 0;
        for (int i = 0; i < list.length; i++) {
            if(list[i] != null){
                System.out.println(list[i] + " at the " + (i+1) + " quarter");
                System.out.println(list[i].calcArea());
                totalArea += list[i].calcArea();
            }
        }
        System.out.println("Total area = " + totalArea);
        System.out.println();
    }
}
