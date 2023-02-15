package challenge;

public class Member {
        String name;
        Gender gender;
        int age;

        public Member(String name, Gender gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Gender getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("Member(%s, %s, %d)", name, gender, age);
        }
    }


