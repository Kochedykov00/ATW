public class Profile {

        private String name;
        private String city;
        private int year;
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public Profile(String id, String name, String city, int year) {
            this.id = id;
            this.name = name;
            this.city = city;
            this.year = year;
        }


    }

