package lesson4;

public class Lesson4_3 {

    public static class Park {

        private String attraction;
        private  int time;

        private int cost;

        public Park(String attraction, int time, int cost) {
            this.attraction = attraction;
            this.time = time;
            this.cost = cost;
        }

        public String getAttraction() {
            return attraction;
        }

        public int getTime() {
            return time;
        }

        public int getCost() {
            return cost;
        }

        public void setAttraction(String attraction) {
            this.attraction = attraction;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }
    }
}
