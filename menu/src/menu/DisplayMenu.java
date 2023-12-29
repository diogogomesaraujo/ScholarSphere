package menu;

import form.Forms;

public class DisplayMenu {

    public static void main(String[] args) {
        // Create main menus
        Menu main = new Menu(null);
        Menu studentMenu = new Menu(main);
        Menu teacherMenu = new Menu(main);
        Menu courseMenu = new Menu(main);
        Menu classMenu = new Menu(main);
        Menu subjectsMenu = new Menu(main);
        Menu gradesMenu = new Menu(main);
        Menu scheduleMenu = new Menu(main);

        // Add menu history

        // Create options for the main menu
        Action a1 = () -> studentMenu.build();
        MenuOption o1 = new MenuOption(main.getChoice(), "Aluno", new Executable(a1));
        main.addOption(o1);

        Action a2 = () -> teacherMenu.build();
        MenuOption o2 = new MenuOption(main.getChoice(), "Professor", new Executable(a2));
        main.addOption(o2);

        Action a3 = () -> courseMenu.build();
        MenuOption o3 = new MenuOption(main.getChoice(), "Curso", new Executable(a3));
        main.addOption(o3);

        Action a4 = () -> classMenu.build();
        MenuOption o4 = new MenuOption(main.getChoice(), "Turma", new Executable(a4));
        main.addOption(o4);

        Action a5 = () -> subjectsMenu.build();
        MenuOption o5 = new MenuOption(main.getChoice(), "Disciplina", new Executable(a5));
        main.addOption(o5);

        Action a6 = () -> gradesMenu.build();
        MenuOption o6 = new MenuOption(main.getChoice(), "Notas", new Executable(a6));
        main.addOption(o6);

        // Submenu options

        // Student submenu options
        Action a8 = () -> Forms.createStudentForm();; 
        MenuOption o8 = new MenuOption(studentMenu.getChoice(), "Criar Aluno e Inserir no Curso", new Executable(a8));
        studentMenu.addOption(o8);

        Action a9 = () -> Forms.viewStudentDetails(); 
        MenuOption o9 = new MenuOption(studentMenu.getChoice(), "Ver Detalhes do Aluno", new Executable(a9));
        studentMenu.addOption(o9);

        // Teacher submenu options
        Action a10 = () -> Forms.createTeacherForm();; 
        MenuOption o10 = new MenuOption(teacherMenu.getChoice(), "Criar Professor e Inserir no Curso", new Executable(a10));
        teacherMenu.addOption(o10);

        Action a11 = () -> Forms.viewTeacherDetails(); 
        MenuOption o11 = new MenuOption(teacherMenu.getChoice(), "Ver Detalhes do Professor", new Executable(a11));
        teacherMenu.addOption(o11);

        // Course submenu options
        Action a12 = () -> Forms.viewCourseDetails(); 
        MenuOption o12 = new MenuOption(courseMenu.getChoice(), "Ver Detalhes do Curso", new Executable(a12));
        courseMenu.addOption(o12);

        // Class submenu options
        Action a13 = () -> Forms.viewClassDetails();
        MenuOption o13 = new MenuOption(classMenu.getChoice(), "Ver Detalhes da Turma", new Executable(a13));
        classMenu.addOption(o13);
        
        Action a14 = () -> scheduleMenu.build();
        MenuOption o14 = new MenuOption(classMenu.getChoice(), "Horário", new Executable(a14));
        classMenu.addOption(o14);
        
        // Schedule submenu options
        Action a15 = () -> Forms.createTimetableForm();
        MenuOption o15 = new MenuOption(scheduleMenu.getChoice(), "Criar Horário", new Executable(a15));
        scheduleMenu.addOption(o15);
        
        Action a16 = () -> Forms.viewTimetableDetails();;
        MenuOption o16 = new MenuOption(scheduleMenu.getChoice(), "Ver Horário", new Executable(a16));
        scheduleMenu.addOption(o16);

        // Subjects submenu options
        Action a17 = () -> Forms.viewSubjectDetails();
        MenuOption o17 = new MenuOption(subjectsMenu.getChoice(), "Ver Detalhes da Disciplina", new Executable(a17));
        subjectsMenu.addOption(o17);

        // Grades submenu options
        Action a18 = () -> System.out.println("."); // Placeholder for assignGrade implementation
        MenuOption o18 = new MenuOption(gradesMenu.getChoice(), "Assign Grade", new Executable(a18));
        gradesMenu.addOption(o18);

        Action a19 = () -> System.out.println("."); // Placeholder for viewGrades implementation
        MenuOption o19 = new MenuOption(gradesMenu.getChoice(), "View Grades", new Executable(a19));
        gradesMenu.addOption(o19);
        
        main.build();
    }
}