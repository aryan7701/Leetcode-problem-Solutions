public class DesignParkingSystem {
    class ParkingSystem {
        int arr[];
        public ParkingSystem(int big, int medium, int small) {
            arr=new int[]{big,medium,small};
        }

        public boolean addCar(int carType) {
            int a=arr[carType-1];
            if(a>0){
                arr[carType-1]--;
                return true;
            }
            else
                return false;
        }
    }
}
