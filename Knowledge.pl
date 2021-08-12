
%%%%%%%%%%%%%%% student(name,year).
student(aya,1).
student(mona,2).
student(nada,3).
student(heba,4).
student(eman,2).
student(ahmed,4).
student(mohamed,4).
student(mahmoud,3).
student(mostafa,2).
student(adam,1).
%%%%%%%%%%%%%%%%% Student

%%% This Rule searches for The Courses of Students within the AcademicYear he/she study
studentCourses(Name,[Head|Tail]):-student(Name,Year),academicYear(Year,[Head|Tail]).


%%%%%%%%%%%%%%%%%academicYear(year, [courses list]).
academicYear(1, [introductionToComputers, humanities, cppProgramming, projectManagement]).
academicYear(2, [introductionToInformationSystems, dataStructures, logicDesign, scientificWriting]).
academicYear(3, [prolog, softwareEngineering, dataBase, automata]).
academicYear(4, [compiler, network, eCommerce, simulation]).
%%%%%%%%%%%%%%%%% Academic Year

%%%%%%%%%%%%%% assist(name,[courses list])
assist(ahmed ,introductionToComputers).
assist(ahmed, humanities).
assist(ahmed, scientificWriting).

assist(mohamed ,logicDesign).
assist(mohamed , simulation ).

assist(sobhy ,introductionToInformationSystems ).
assist(sobhy  , dataBase ).
assist(sobhy , projectManagement).

assist(ali ,eCommerce ).
assist(ali ,dataStructures).

assist(mostafa ,simulation ).
assist(mostafa , logicDesign ).
assist(mostafa  , cppProgramming).

assist(samy ,network ).
assist(samy ,dataBase ).
assist(samy , scientificWriting).

assist(mona , projectManagement).
assist(mona ,introductionToComputers).
assist(mona , automata ).

assist(hanaa ,softwareEngineering).
%%%%%%%%%%%%%%  ASSISTANT

%%% This Rule to show The Assistant that Teach Courses dealing with Course Predicate
assistCourses([], []).
assistCourses([H|T], [H1|T1]):- assist(H1, H), assistCourses(T, T1).


%%%%%%%%%%%%%%%%%% training(level,duration,trainner,content).

     training(1,3,a_mohamed,python).
     training(1,3,a_ahmed,java).
     training(2,4,a_aya,web).
     training(2,4,a_mona,android).
     training(2,4,a_mahmoud,flutter).
     training(3,4,a_mostafa,machine_learning).
     training(3,4,a_amal,deep_learning).
     training(3,4,a_ashraf,embedded_systems).
%%%%%%%%%%%%%%%%%% Training

%%%% This Rule for Training for A Given Student
 tr(StudentName, ContentOfTr, DurationOfTr, Trainer):- student(StudentName, Year), training(Year, DurationOfTr, Trainer, ContentOfTr).

%%%%% This Rule shows The Name of Doctors According to a given List of Courses He Teaches
showDoctorByCourses([], []).
showDoctorByCourses([H|T], [H1|T1]):- course(H, H1), showDoctorByCourses(T, T1).

%%%%%%%%%%%%%%%%%% course(name,lecturer)
course(introductionToComputers,dr_Ahmed).
course(humanities,dr_Eman).
course(cppProgramming,dr_Mohamed).
course(projectManagement,dr_Hassan).
course(introductionToInformationSystems,dr_MAbdelFattah).
course(dataStructures,dr_Mona).
course(logicDesign,dr_Hala).
course(scientificWriting,dr_Walaa).
course(prolog,dr_Metwally).
course(softwareEngineering,dr_Shimaa).
course(dataBase,dr_Fatma).
course(automata,dr_Fathi).
course(compiler,dr_Sayed).
course(network,dr_Ali).
course(eCommerce,dr_Noha).
course(simulation,dr_Adel).
%%%%%%%%%%%%%%%%%% Course
