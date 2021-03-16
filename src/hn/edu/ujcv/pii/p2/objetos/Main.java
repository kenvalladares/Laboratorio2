package hn.edu.ujcv.pii.p2.objetos;

import java.awt.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in).useDelimiter("\\n");

    public static void main(String[] args) {
        // write your code here

        int opcion;
        try
        {
            ListaAlumnos alumnos = new ListaAlumnos();
            ListaCampus campus= new ListaCampus();
            ListaCarreras carreras = new ListaCarreras();
            ListaClases clases = new ListaClases();
            ListaCatedraticos catedraticos = new ListaCatedraticos();
            ListaHistoriales historiales = new ListaHistoriales();
            ListaPeriodos periodos = new ListaPeriodos();

            do {

                System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
                System.out.println(ANSI_YELLOW+"*"+ANSI_BLUE + "             MENU DE OPCIONES              " +ANSI_YELLOW+"*"+ANSI_RESET);
                System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
                System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"             1.Campus                      "+ANSI_YELLOW+"*");
                System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"             2.Carreras                    "+ANSI_YELLOW+"*");
                System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"             3.Periodo                     "+ANSI_YELLOW+"*");
                System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"             4.Catedráticos                "+ANSI_YELLOW+"*");
                System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"             5.Clases                      "+ANSI_YELLOW+"*");
                System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"             6.Alumnos                     "+ANSI_YELLOW+"*");
                System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"             7.Historial                   "+ANSI_YELLOW+"*");
                System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"             8.Salir                       "+ANSI_YELLOW+"*");
                System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
                System.out.println("                                             ");
                System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"        Seleccione una opción              "+ANSI_YELLOW+"*"+ANSI_RESET);
                opcion = teclado.nextInt();


                switch (opcion) {
                    case 1:
                        MenuCampus(campus);
                        break;
                    case 2:
                        MenuCarreras(carreras);
                        break;
                    case 3:
                        MenuPeriodo(periodos);
                        break;
                    case 4:
                        MenuCatedraticos(catedraticos);
                        break;
                    case 5:
                        MenuClases(clases);
                        break;
                    case 6:
                        MenuAlumnos(alumnos);
                        break;
                    case 7:
                        MenuHistorial(historiales, alumnos, campus, carreras, periodos, clases);
                }
            }while(opcion != 8);

        }catch (Exception e )
        {
            System.out.println("ERROR" + e.getMessage());
        }
    }
    private static void MenuCampus(ListaCampus campuss) {
        String respuesta;
        int opcion;
        do {
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_BLUE +"             MENU DE OPCIONES - CAMPUS  " +ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"       1. Agregar Campus           "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"       2. Buscar Campus            "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"       3. Ver Lista de Campus    "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println("                                     ");
            System.out.println("        Seleccione una opción         ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    do{
                        Campus campus  = new Campus();
                        System.out.println("Ingrese el código ");
                        campus.setId(teclado.nextInt());
                        System.out.println("Ingrese el nombre ");
                        campus.setNombre(teclado.next());
                        System.out.println("Ingrese dirección ");
                        campus.setDireccion(teclado.next());
                        String fechInicio = "";
                        System.out.println("Ingrese la fecha de inicio  ");
                        fechInicio = teclado.next();
                        campus.setFechaInicio(fechInicio);
                        campuss.AddCampus(campus);
                        System.out.println(ANSI_YELLOW+"*************************************"+ANSI_RESET);
                        System.out.println("¿Desea seguir añadiendo campus? S/N");
                        respuesta = teclado.next();
                    } while (respuesta.equalsIgnoreCase("s"));
                    break;
                case 2:
                {
                    System.out.println("Digite el Id del Campus :");
                    long id = teclado.nextLong();
                    Campus buscado = campuss.BuscarCampus(id);
                    if(buscado != null){
                        System.out.println(buscado.toString());
                    } else{
                        System.out.println(ANSI_RED+"El ID del Campus ingresado no existe"+ANSI_RESET);
                    }
                }
                break;
                case 3:
                    campuss.ImprimirLista();
                    break;
            }
            System.out.println("¿Desea volver al menú de Campus? S/N");
            respuesta = teclado.next();
        }while (respuesta.equalsIgnoreCase("s"));
    }

    private static void MenuCarreras(ListaCarreras carreras) {
        String rciclo;
        int opcion;
        do {

            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_BLUE +"             MENU DE OPCIONES - CARRERAS  " +ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"      1. Agregar Carreras          "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"      2. Buscar Carrera            "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"      3. Ver Lista de Carreras     "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println("                                     ");
            System.out.println("        Seleccione una opción         ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    do{
                        Carrera carrera  = new Carrera();
                        System.out.println("Ingrese el ID ");
                        carrera.setId(teclado.nextInt());
                        System.out.println("Ingrese el nombre ");
                        carrera.setNombre(teclado.next());
                        carreras.AddCarrera(carrera);
                        System.out.println(ANSI_YELLOW+"*************************************"+ANSI_RESET);
                        System.out.println("¿Desea seguir añadiendo carreras? S/N");
                        rciclo = teclado.next();
                    } while (rciclo.equalsIgnoreCase("s"));
                    break;
                case 2:
                {
                    System.out.println("Digite el Id de la Carrera :");
                    long id = teclado.nextLong();
                    Carrera buscado = carreras.Buscar(id);
                    if(buscado != null){
                        System.out.println(buscado.toString());
                    } else{
                        System.out.println(ANSI_RED+"La ID de la carrera ingresada no existe"+ANSI_RESET);
                    }

                }
                break;
                case 3:
                    carreras.ImprimirLista();
                    break;

            }
            System.out.println("¿Desea volver al menú de Carreras? S/N");
            rciclo = teclado.next();
        }while (rciclo.equalsIgnoreCase("s"));
    }

    private static void MenuPeriodo(ListaPeriodos periodos) {
        String rCiclos;
        int opcion;
        do {
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_BLUE + "             MENU DE OPCIONES - PERIODO    " +ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"    1. Agregar Periodo            "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"    2. Buscar Periodo             "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"    3. Ver Lista de Periodos      "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"    4. Regresar                   "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"************************************"+ANSI_RESET);
            System.out.println("                                    ");
            System.out.println("        Seleccione una opción        ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    do{
                        Periodo periodo  = new Periodo();
                        System.out.println("Digite el ID ");
                        periodo.setId(teclado.nextInt());
                        System.out.println("Ingrese la descripción ");
                        periodo.setDescripcion(teclado.next());
                        String fechaIni = "";
                        System.out.println("Ingrese la fecha de inicio ");
                        fechaIni = teclado.next();
                        String fechaFin = "";
                        System.out.println("Ingrese la fecha de finalización ");
                        fechaFin = teclado.next();
                        periodo.setFechaInicio(fechaIni);
                        periodo.setFechaFin(fechaFin);
                        periodos.AddPeriodo(periodo);
                        System.out.println(ANSI_YELLOW+"**********************************"+ANSI_RESET);
                        System.out.println("¿Desea seguir creando periodos? S/N");
                        rCiclos = teclado.next();
                    } while (rCiclos.equalsIgnoreCase("s"));
                    break;
                case 2:
                {
                    System.out.println("Digite el Id del periodo :");
                    long id = teclado.nextLong();
                    Periodo buscado = periodos.Buscar(id);
                    if(buscado != null){
                        System.out.println(buscado.toString());
                    } else{
                        System.out.println(ANSI_RED+"El ID del periodo ingresado no existe"+ANSI_RESET);
                    }

                }
                break;
                case 3:

                periodos.ImprimirLista();
                break;
            }
            System.out.println("¿Desea volver al menú de Periodos? S/N");
            rCiclos = teclado.next();
        }while (rCiclos.equalsIgnoreCase("s"));
    }

    private static void MenuCatedraticos(ListaCatedraticos catedraticos) {
        String rciclo;
        int opcion;
        do {
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_BLUE +"             MENU DE OPCIONES - CATEDRATICOS  " +ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"     1. Agregar Cátedratico        "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"     2. Buscar Cátedratico         "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"    3. Ver Lista de Cátedraticos  "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println("                                     ");
            System.out.println("        Seleccione una opción         ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    do{
                        Catedratico catedratico  = new Catedratico();
                        System.out.println("Ingrese el codigo ");
                        catedratico.setCodigo(teclado.nextInt());
                        System.out.println("Digite el ID ");
                        catedratico.setId(teclado.nextInt());
                        System.out.println("Ingrese el nombre ");
                        catedratico.setNombre(teclado.next());
                        catedraticos.AddCatedratico(catedratico);
                        System.out.println(ANSI_YELLOW+"*************************************"+ANSI_RESET);
                        System.out.println("¿Desea seguir añadiendo cátedraticos? S/N");
                        rciclo = teclado.next();
                    } while (rciclo.equalsIgnoreCase("s"));
                    break;
                case 2:
                {
                    System.out.println("Digite el Id del cátedratico :");
                    long id = teclado.nextLong();
                    Catedratico buscar = catedraticos.Buscar(id);
                    if(buscar != null){
                        System.out.println(buscar.toString());
                    } else{
                        System.out.println(ANSI_RED+"El ID del Cátedratico ingresado no existe"+ANSI_RESET);
                    }
                }
                break;
                case 3:
                    catedraticos.ImprimirLista();
                    break;
            }
            System.out.println("¿Desea volver al menú de Cátedraticos? S/N");
            rciclo = teclado.next();
        }while (rciclo.equalsIgnoreCase("s"));
    }

    private static void MenuClases(ListaClases clases) {
        String rCiclos;
        int opcion;
        do {
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_BLUE + "             MENU DE OPCIONES - CLASES    " +ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"       1. Añadir Clases            "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"       2. Buscar Clase             "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"       3. Ver Lista de Clases      "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"       4. Salir                    "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println("                                     ");
            System.out.println("        Seleccione una opción         ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    do{
                        SubMenuClases(clases);
                        System.out.println("¿Desea seguir agregando clases? S/N");
                        rCiclos = teclado.next();
                    } while (rCiclos.equalsIgnoreCase("s"));
                    break;
                case 2:
                {
                    System.out.println("Digite el Id de la clase :");
                    long id = teclado.nextLong();
                    Clase buscado = clases.Buscar(id);
                    if(buscado != null){
                        System.out.println(buscado.toStringLineal());
                    } else{
                        System.out.println(ANSI_RED+"La Id de la clase ingresada no existe"+ANSI_RESET);
                    }

                }
                break;
                case 3:
                    clases.ImprimirLista();
                    break;

            }
            System.out.println("¿Desea volver al menú de Clases? S/N");
            rCiclos = teclado.next();
        }while (rCiclos.equalsIgnoreCase("s"));
    }

    private static void SubMenuClases(ListaClases clases) {
        int opcion = 0;
        do{
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_BLUE + "             SUBMENU DE OPCIONES - CLASES  " +ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"       1. General               "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"       2. Idioma                "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"       3. Ingeniería            "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"       4. Avanzada              "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"       5. Salir                 "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println("                                  ");
            System.out.println("        Seleccione una opción      ");
            opcion = teclado.nextInt();
            if(opcion >=1 && opcion <= 4)
            {
                System.out.println("¿Pertenece a todas las carreras S/N? : ");
                boolean pertenece = teclado.next().equalsIgnoreCase("s");
                System.out.println("Ingrese el Id");
                int id = teclado.nextInt();
                System.out.println("Ingrese el nombre: ");
                String nombre = teclado.next();
                System.out.println("Ingrese las unidades valorativas: ");
                int uv = teclado.nextInt();
                switch (opcion){
                    case 1:
                        General clase = new General();
                        clase.setTodasCarreras(pertenece);
                        clase.setId(id);
                        clase.setNombre(nombre);
                        clase.setUnidadesValorativas(uv);
                        clases.AddClase(clase);
                        break;
                    case 2:
                        Idioma claseIdioma = new Idioma();
                        claseIdioma.setTodasCarreras(pertenece);
                        claseIdioma.setId(id);
                        claseIdioma.setNombre(nombre);
                        claseIdioma.setUnidadesValorativas(uv);
                        clases.AddClase(claseIdioma);
                        break;
                    case 3:

                        Ingenieria claseIng = new Ingenieria();
                        claseIng.setTodasCarreras(pertenece);
                        claseIng.setId(id);
                        claseIng.setNombre(nombre);
                        claseIng.setUnidadesValorativas(uv);
                        clases.AddClase(claseIng);
                        break;
                    case 4:
                        System.out.println("Ingrese si tiene vinculación:");
                        int tieneVinculacion = teclado.nextInt();
                        Avanzada claseAvanzada = new Avanzada();
                        claseAvanzada.setTieneVinculacion(tieneVinculacion);
                        claseAvanzada.setId(id);
                        claseAvanzada.setNombre(nombre);
                        claseAvanzada.setUnidadesValorativas(uv);
                        clases.AddClase(claseAvanzada);
                        break;
                }
            }

        }while (opcion != 5);
    }

    private static void MenuAlumnos(ListaAlumnos alumnos) {
        String respuesta;
        int opcion;
        do {
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_BLUE +"             MENU DE OPCIONES - ALUMNOS  " +ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"   1. Agregar Alumno               "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"   2. Buscar Alumno                "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"   3. Ver Lista de Alumnos         "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println("                                     ");
            System.out.println("        Seleccione una opción         ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    do{

                        Alumno Alumnos  = new Alumno();
                        System.out.println("Ingrese el nombre ");
                        Alumnos.setNombre(teclado.next());
                        System.out.println("Digitee el numero de cuenta");
                        Alumnos.setCuenta(teclado.nextLong());
                        System.out.println("Digite el ID");
                        Alumnos.setId (teclado.nextInt());
                        alumnos.addAlumno(Alumnos);
                        System.out.println(ANSI_YELLOW+"*************************************"+ANSI_RESET);
                        System.out.println("¿Desea seguir añadiendo alumnos? S/N");
                        respuesta = teclado.next();
                    } while (respuesta.equalsIgnoreCase("s"));
                    break;
                case 2:
                {
                    System.out.println("Digite el Id del Alumno :");
                    long id = teclado.nextLong();
                    Alumno buscado = alumnos.BuscarAlumno(id);
                    if(buscado != null){
                        System.out.println(buscado.toString());
                    } else{
                        System.out.println(ANSI_RED+"El ID del Alumno ingresado no existe"+ANSI_RESET);
                    }

                }
                break;


                case 3:
                    alumnos.ImprimirLista();
                    break;

            }
            System.out.println("¿Desea volver al menú de alumnos? S/N");
            respuesta = teclado.next();
        }while (respuesta.equalsIgnoreCase("s"));
    }

    private static void MenuHistorial(ListaHistoriales historiales, ListaAlumnos alumnos, ListaCampus campuss, ListaCarreras carreras, ListaPeriodos periodos, ListaClases clases) {
        String rCiclos;
        int opcion;
        do {
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_BLUE + "             MENU DE OPCIONES - HISTORIAL  " +ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*********************************************"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"  1. Agregar Historial           "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"  2. Ver Lista de Historiales    "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"*"+ANSI_RESET+"  3. Regresar                    "+ANSI_YELLOW+"*"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"***********************************"+ANSI_RESET);
            System.out.println("                                   ");
            System.out.println("        Seleccione una opción       ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    do{
                        Historial historial = new Historial();
                        Alumno alumno;
                        Campus campus;
                        Carrera carrera;
                        Periodo periodo;

                        if(alumnos.Cantidad() == 0){
                            System.out.println(ANSI_RED+"Necesita ingresar un alumno para poder agregar un historial"+ANSI_RESET);
                            return;
                        }

                        if(campuss.Cantidad() == 0){
                            System.out.println(ANSI_RED+"Necesita ingresar un campus para poder agregar un  historial "+ANSI_RESET);
                            return;
                        }
                        if(carreras.Cantidad() == 0){
                            System.out.println(ANSI_RED+"Necesita ingresar una carrera para poder agregar un  historial "+ANSI_RESET);
                            return;
                        }

                        if(periodos.Cantidad() == 0){
                            System.out.println(ANSI_RED+"Necesita ingresar un periodo para poder agregar un historial "+ANSI_RESET);
                            return;
                        }

                        if(clases.Cantidad() == 0){
                            System.out.println(ANSI_RED+"Necesita ingresar una clase para poder agregar un historial"+ANSI_RESET);
                            return;
                        }

                        do {
                            alumnos.ImprimirLista();
                            System.out.println("Digite el Id del alumno:");
                            int idAlumno = teclado.nextInt();
                            alumno = alumnos.BuscarAlumno(idAlumno);
                            if(alumno==null){
                                System.out.printf(ANSI_RED+"Alumno no existe"+ANSI_RESET);
                            }
                        }while (alumno==null);

                        do {
                            campuss.ImprimirLista();
                            System.out.println("Digite el Id del campus:");
                            int id = teclado.nextInt();
                            campus = campuss.BuscarCampus(id);
                            if(campuss==null){
                                System.out.printf(ANSI_RED+"El ID del Campus ingresado no existe"+ANSI_RESET);
                            }
                        }while (campuss==null);

                        do {
                            carreras.ImprimirLista();
                            System.out.println("Digite el Id de la carrera:");
                            int id = teclado.nextInt();
                            carrera = carreras.Buscar(id);
                            if(carrera==null){
                                System.out.printf(ANSI_RED+"El ID de la Carrera ingresada no existe"+ANSI_RESET);
                            }
                        }while (carrera==null);

                        do {
                            periodos.ImprimirLista();
                            System.out.println("Digite el Id del periodo:");
                            int id = teclado.nextInt();
                            periodo = periodos.Buscar(id);
                            if(periodo==null){
                                System.out.printf(ANSI_RED+"El ID del Periodo ingresado no existe"+ANSI_RESET);
                            }
                        }while (periodo==null);

                        String masClases="";
                        ArrayList<Clase> clasesH = new ArrayList<>();
                        do{
                            Clase clase;
                            do {
                                clases.ImprimirLista();
                                System.out.println("Digite el Id de la clase:");
                                int id = teclado.nextInt();
                                clase = clases.Buscar(id);
                                if(clase==null){
                                    System.out.printf(ANSI_RED+"El ID de la Clase ingresada  no existe"+ANSI_RESET);
                                }
                            }while (clase==null);

                            clase.PedirNotas(teclado);
                            clasesH.add(clase);
                        }while (masClases.equalsIgnoreCase("s"));
                        historial.setAlumno(alumno);
                        historial.setCampus(campus);
                        historial.setCarrera(carrera);
                        historial.setPeriodo(periodo);
                        historial.setClases(clasesH);
                        historiales.AddHistorial(historial);
                        System.out.println(ANSI_YELLOW+"***********************************"+ANSI_RESET);
                        System.out.println("¿Desea seguir creando historiales? S/N");
                        rCiclos = teclado.next();
                    } while (rCiclos.equalsIgnoreCase("s"));
                    break;
                case 2:
                    historiales.ImprimirLista();
                    break;
            }
            System.out.println("¿Desea volver al menú de Historiales? S/N");
            rCiclos = teclado.next();
        }while (rCiclos.equalsIgnoreCase("s"));
    }

    // Metodos para los colores
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public  static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

}