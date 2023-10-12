package pl.sii.javalambda.packageReference;

class Student35 {
      public int id;
      public long gpa;
      public String name;

      Student35(int id, long g, String name) {
         this.id = id;
         this.gpa = g;
         this.name = name;
      }

      @Override
      public String toString() {
         return id + ">" + name + ": " + gpa;
      }
   }