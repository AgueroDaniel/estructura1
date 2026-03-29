typedef struct student {
    char *name;
    char *id;
    int credits;
} Student;

Student * student_init( char *name, char *id, int credits ){
  Student s = (Student) malloc(sizeOf(struct Student));
  s->name = name;
  s->id = id;
  s->credits = credits;
  return s;
}

void cambiar_nombre(Student* self, char * name) {
  self->name = name;
}

int main(int argc, char const *argv[])
{
  Student s = student_init("Sonia", "1", 0);
  cambiar_nombre(s,"Gaston");
  printf("%s\n","s.name" );
  return 0;
}