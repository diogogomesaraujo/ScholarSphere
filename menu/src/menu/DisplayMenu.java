package menu;

import form.*;

/**
 * Creates and manages a text-based menu system for a school management application. 
 * This class sets up the main menu and various submenus, each with specific options 
 * for managing students, teachers, courses, classes, subjects, grades, timetables, 
 * and displaying statistics.
 */
public class DisplayMenu 
{
	/**
     * The main method to start the application. It initializes the menu system and 
     * loads the predefined data from a file.
     * 
     * @param args Command line arguments (not used in this application).
     */
    public static void main(String[] args) 
    {
    	form.Forms.readFile();
    	
        // Create main menus
        Menu main = new Menu(null);
        Menu manageMenu = new Menu(main);
        Menu statisticsMenu = new Menu(main);
        Menu studentMenu = new Menu(manageMenu);
        Menu teacherMenu = new Menu(manageMenu);
        Menu courseMenu = new Menu(manageMenu);
        Menu classMenu = new Menu(manageMenu);
        Menu subjectsMenu = new Menu(manageMenu);
        Menu gradesMenu = new Menu(manageMenu);
        Menu scheduleMenu = new Menu(manageMenu);
        Menu editStudentMenu = new Menu(studentMenu);
        Menu editTeacherMenu = new Menu(teacherMenu);

        // Add menu history

        // Create options for the main menu
        Action a1111 = () -> manageMenu.build();
        MenuOption o1111 = new MenuOption(main.getChoice(), "Gerir Escola", new Executable(a1111));
        main.addOption(o1111);
        
        Action a1 = () -> studentMenu.build();
        MenuOption o1 = new MenuOption(manageMenu.getChoice(), "Aluno", new Executable(a1));
        manageMenu.addOption(o1);

        Action a2 = () -> teacherMenu.build();
        MenuOption o2 = new MenuOption(manageMenu.getChoice(), "Professor", new Executable(a2));
        manageMenu.addOption(o2);

        Action a3 = () -> courseMenu.build();
        MenuOption o3 = new MenuOption(manageMenu.getChoice(), "Curso", new Executable(a3));
        manageMenu.addOption(o3);

        Action a4 = () -> classMenu.build();
        MenuOption o4 = new MenuOption(manageMenu.getChoice(), "Turma", new Executable(a4));
        manageMenu.addOption(o4);

        Action a5 = () -> subjectsMenu.build();
        MenuOption o5 = new MenuOption(manageMenu.getChoice(), "Disciplina", new Executable(a5));
        manageMenu.addOption(o5);

        Action a6 = () -> gradesMenu.build();
        MenuOption o6 = new MenuOption(manageMenu.getChoice(), "Notas", new Executable(a6));
        manageMenu.addOption(o6);

        // Submenu options

        // Student submenu options
        Action a8 = () -> Forms.createStudentForm(); 
        MenuOption o8 = new MenuOption(studentMenu.getChoice(), "Criar Aluno", new Executable(a8));
        studentMenu.addOption(o8);

        Action a9 = () -> Forms.viewStudentDetails(); 
        MenuOption o9 = new MenuOption(studentMenu.getChoice(), "Ver Detalhes do Aluno", new Executable(a9));
        studentMenu.addOption(o9);
        
        Action a20 = () -> editStudentMenu.build(); 
        MenuOption o20 = new MenuOption(studentMenu.getChoice(), "Editar Detalhes do Aluno", new Executable(a20));
        studentMenu.addOption(o20);
        
        Action a90 = () -> Forms.deleteStudent(); 
        MenuOption o90 = new MenuOption(studentMenu.getChoice(), "Remover Aluno", new Executable(a90));
        studentMenu.addOption(o90);
        
        Action a91 = () -> Forms.showAllStudents(); 
        MenuOption o91 = new MenuOption(studentMenu.getChoice(), "Ver Todos os Alunos", new Executable(a91));
        studentMenu.addOption(o91);
        
        Action a21 = () -> Forms.editStudentDetails("Name"); 
        MenuOption o21 = new MenuOption(studentMenu.getChoice(), "Alterar Nome", new Executable(a21));
        editStudentMenu.addOption(o21);
        
        Action a22 = () -> Forms.editStudentDetails("Gender"); 
        MenuOption o22 = new MenuOption(studentMenu.getChoice(), "Alterar Género", new Executable(a22));
        editStudentMenu.addOption(o22);
        
        Action a23 = () -> Forms.editStudentDetails("Birthday"); 
        MenuOption o23 = new MenuOption(studentMenu.getChoice(), "Alterar Data de Nascimento", new Executable(a23));
        editStudentMenu.addOption(o23);
        
        Action a24 = () -> Forms.editStudentDetails("Address"); 
        MenuOption o24 = new MenuOption(studentMenu.getChoice(), "Alterar Morada", new Executable(a24));
        editStudentMenu.addOption(o24);
        
        Action a25 = () -> Forms.editStudentDetails("EnrolledCourse and SchoolClass"); 
        MenuOption o25 = new MenuOption(studentMenu.getChoice(), "Alterar Curso e Turma", new Executable(a25));
        editStudentMenu.addOption(o25);

        // Teacher submenu options
        Action a10 = () -> Forms.createTeacherForm();; 
        MenuOption o10 = new MenuOption(teacherMenu.getChoice(), "Criar Professor", new Executable(a10));
        teacherMenu.addOption(o10);

        Action a11 = () -> Forms.viewTeacherDetails(); 
        MenuOption o11 = new MenuOption(teacherMenu.getChoice(), "Ver Detalhes do Professor", new Executable(a11));
        teacherMenu.addOption(o11);
        
        Action a26 = () -> editTeacherMenu.build(); 
        MenuOption o26 = new MenuOption(teacherMenu.getChoice(), "Editar Detalhes do Professor", new Executable(a26));
        teacherMenu.addOption(o26);
        
        Action a111 = () -> Forms.deleteTeacher(); 
        MenuOption o111 = new MenuOption(teacherMenu.getChoice(), "Remover Professor", new Executable(a111));
        teacherMenu.addOption(o111);
        
        Action a112 = () -> Forms.showAllTeachers(); 
        MenuOption o112 = new MenuOption(teacherMenu.getChoice(), "Ver Todos os Professores", new Executable(a112));
        teacherMenu.addOption(o112);
        
        Action a28 = () -> Forms.editTeacherDetails("Name"); 
        MenuOption o28 = new MenuOption(studentMenu.getChoice(), "Alterar Nome", new Executable(a28));
        editTeacherMenu.addOption(o28);
        
        Action a29 = () -> Forms.editTeacherDetails("Gender"); 
        MenuOption o29 = new MenuOption(studentMenu.getChoice(), "Alterar Género", new Executable(a29));
        editTeacherMenu.addOption(o29);
        
        Action a30 = () -> Forms.editTeacherDetails("Birthday"); 
        MenuOption o30 = new MenuOption(studentMenu.getChoice(), "Alterar Data de Nascimento", new Executable(a30));
        editTeacherMenu.addOption(o30);
        
        Action a31 = () -> Forms.editTeacherDetails("Address"); 
        MenuOption o31 = new MenuOption(studentMenu.getChoice(), "Alterar Morada", new Executable(a31));
        editTeacherMenu.addOption(o31);
        
        Action a32 = () -> Forms.editTeacherDetails("SubjectTaught"); 
        MenuOption o32 = new MenuOption(studentMenu.getChoice(), "Alterar Disciplina", new Executable(a32));
        editTeacherMenu.addOption(o32);
        
        // Course submenu options
        Action a12 = () -> Forms.viewCourseDetails(); 
        MenuOption o12 = new MenuOption(courseMenu.getChoice(), "Ver Detalhes do Curso", new Executable(a12));
        courseMenu.addOption(o12);

        // Class submenu options
        Action a33 = () -> Forms.assignTeacherToClass();
        MenuOption o33 = new MenuOption(classMenu.getChoice(), "Atribuir Professor à Turma", new Executable(a33));
        classMenu.addOption(o33);
        
        Action a13 = () -> Forms.viewClassDetails();
        MenuOption o13 = new MenuOption(classMenu.getChoice(), "Ver Detalhes da Turma", new Executable(a13));
        classMenu.addOption(o13);
        
        Action a44 = () -> Forms.showAllClasses();;
        MenuOption o44 = new MenuOption(classMenu.getChoice(), "Ver Todas as Turmas", new Executable(a44));
        classMenu.addOption(o44);
        
        Action a14 = () -> scheduleMenu.build();
        MenuOption o14 = new MenuOption(classMenu.getChoice(), "Menu do Horário", new Executable(a14));
        classMenu.addOption(o14);
        
        // Schedule submenu options
        Action a15 = () -> Forms.createTimetableForm();
        MenuOption o15 = new MenuOption(scheduleMenu.getChoice(), "Criar ou Editar Horário da Turma", new Executable(a15));
        scheduleMenu.addOption(o15);
        
        Action a16 = () -> Forms.viewTimetableDetails();;
        MenuOption o16 = new MenuOption(scheduleMenu.getChoice(), "Ver Horário da Turma", new Executable(a16));
        scheduleMenu.addOption(o16);

        // Subjects submenu options
        Action a17 = () -> Forms.viewSubjectDetails();
        MenuOption o17 = new MenuOption(subjectsMenu.getChoice(), "Ver Detalhes da Disciplina", new Executable(a17));
        subjectsMenu.addOption(o17);

        // Grades submenu options
        Action a18 = () -> Forms.assignGrade();
        MenuOption o18 = new MenuOption(gradesMenu.getChoice(), "Atribuir Nota a um Aluno", new Executable(a18));
        gradesMenu.addOption(o18);

        Action a19 = () -> Forms.viewStudentGrades();
        MenuOption o19 = new MenuOption(gradesMenu.getChoice(), "Ver Notas do Aluno", new Executable(a19));
        gradesMenu.addOption(o19);
        
        Action a50 = () -> Forms.showAndCalculateAverage();
        MenuOption o50 = new MenuOption(gradesMenu.getChoice(), "Ver Média do Aluno", new Executable(a50));
        gradesMenu.addOption(o50);
        
        Action a7 = () -> statisticsMenu.build();
        MenuOption o7 = new MenuOption(main.getChoice(), "Estatística", new Executable(a7));
        main.addOption(o7);
        
        Action a77 = () -> Forms.showMostStudents();
        MenuOption o77 = new MenuOption(main.getChoice(), "Ver os Cursos com Mais Estudantes", new Executable(a77));
        statisticsMenu.addOption(o77);
        
        Action a53 = () -> Forms.showStudentWithBestAverage();
        MenuOption o53 = new MenuOption(gradesMenu.getChoice(), "Ver Aluno com Melhor Média", new Executable(a53));
        statisticsMenu.addOption(o53);
        
        Action a78 = () -> Forms.showBestAverageClass();
        MenuOption o78 = new MenuOption(statisticsMenu.getChoice(), "Ver a Turma com Melhores Notas", new Executable(a78));
        statisticsMenu.addOption(o78);
        
        main.build();
    }
}
