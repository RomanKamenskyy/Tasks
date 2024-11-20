package day11;

public class task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        ///System.out.println(warehouse.getBalance());

        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        for (int i=0; i<1501; i++){
            picker.doWork();
            picker.bonus();
        }

        System.out.println(warehouse.toString());
        System.out.println(picker.getSalary());
    }
}
