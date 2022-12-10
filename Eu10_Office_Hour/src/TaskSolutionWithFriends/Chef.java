package TaskSolutionWithFriends;

public class Chef {

        public String name;
        public int employeeId;
        public double hourlyRate;
        public boolean fullTime;


        public Chef(String name, int employeeId, double hourlyRate, boolean fullTime) {
            this.name = name;
            this.employeeId = employeeId;
            this.hourlyRate = hourlyRate;
            this.fullTime = fullTime;
        }

        public void makeOrder(){
            System.out.println(name+" is making order");
        }
        public void washDishes(){
            System.out.println(name+" is washing dishes");
        }



        public String toString() {
            return "Chef{" +
                    "name='" + name + '\'' +
                    ", employeeId=" + employeeId +
                    ", hourlyRate=" + hourlyRate +
                    ", fullTime=" + ((fullTime)?" is full time ":"is part time") +
                    '}';
        }

        public static void main(String[] args) {
            Chef chef1 = new Chef("neva",125,12.5,true);
            System.out.println(chef1);
        }

    }

