package Lesson.Classes.NestedClass;

public class SmartPhone {
    private String model;
    private Battery battery;

    public SmartPhone(String model) {
        this.model = model;
        this.battery =  new Battery(true);
    }

    public void infoBattery() {
       if (battery.state = true ) {
           System.out.println("Батарея заряжена");
       } else {
           System.out.println("Батарея разряжена");
       }
    }


    private static class Battery {
        private boolean state;

        public Battery(boolean state) {
            this.state = state;
        }

        public boolean isState() {
            return state;
        }



        public void setState(boolean state) {
            this.state = state;
        }


    }
}
