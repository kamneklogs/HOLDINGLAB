package ui;

import model.*;
import java.util.*;

public class Main {

	static final String ACSP = "AGRICULTURA, CAZA, SILVICULTURA Y PEZCA ";
	static final String EMC = "EXPLOTACION DE MINAS Y CANTERAS ";
	static final String IM = "INDUSTRIA MANOFACTURERA";
	static final String EGV = "ELECTRICIDAD, GAS Y VAPOR";
	static final String C = "CONSTRUCCION";
	static final String CAPYM = "COMERCIO AL POR MAYOR Y AL POR MENOR";
	static final String TAC = "TRANSPORTE, ALMACENAMIENTO Y COMUNICACIONES";
	static final String FSIC = "EST.F/CIEROS,SEGUROS,B.INMUEBLES,SERV. A COMPANIAS ";
	static final String CS = "COMUNALES, SOCIALES";

	static int option, option1, option2, option3, option4, option5, option6, option7, option8, optStatus, optMod, cT,
			iterator, iterator1, iterator2, iterator3, iterator4, qEmployees, yearsA, ranking, qStudents12, qTStudents,
			qUnits, invCode, backMenu;
	static String name, nit, adress, phone, dateCreation, typeC, nameLR, providedS, idMEN, directorN, educationS, nameP,
			idC, sanitaryR, expiration, modality;
	static double assets, qWater;
	static boolean centinel = false;
	static boolean centinel1 = false;
	static boolean centinel2 = false;
	static boolean status;
	static boolean sanitaryPer, foodHandling;

	static Scanner a = new Scanner(System.in);

	private Holding theHolding;

	public Main() {

		theHolding = new Holding("El mejor holding");

	}

	public void menu() {

		System.out.println("**********************************************************************************");
		System.out.println("|        Bienvenido a la administracion del holding empresarial. Que desea hacer? |");
		System.out.println("|   1. Agregar nuevas empresas                                                    |");
		System.out.println("|   2. Generar informe de los datos de algunas empresas                           |");
		System.out.println("|                                                                                 |");
		System.out.println("**********************************************************************************\n");

	}

	public void editLegalP() {

		System.out.println("__________________________________________________________________________________");
		System.out.println("Ingrese los datos que se le solicitan a continuacion\n");
		System.out.println("Nombre de la empresa o institucion:");
		name = a.nextLine();
		name = a.nextLine();
		System.out.println("Nit de la empresa o institucion:");
		nit = a.nextLine();
		System.out.println("Direccion:");
		adress = a.nextLine();
		System.out.println("Telefono");
		phone = a.nextLine();
		System.out.println("Fecha de creacion");
		dateCreation = a.nextLine();
		System.out.println("Escoja el tipo de empresa o intitucion a registrar:\n");
		System.out.println(
				"1. AGRICULTURA, CAZA, SILVICULTURA Y PEZCA\n2. EXPLOTACION DE MINAS Y CANTERAS\n3. INDUSTRIA MANOFACTURERA\n4. ELECTRICIDAD, GAS Y VAPOR\n5. CONSTRUCCION\n6. COMERCIO AL POR MAYOR Y AL POR MENOR\n7. TRANSPORTE, ALMACENAMIENTO Y COMUNICACIONES\n8. EST.F/CIEROS,SEGUROS,B.INMUEBLES,SERV. A COMPANIAS\n9. COMUNALES, SOCIALES");
		cT = a.nextInt();

		switch (cT) {
		case 1:
			typeC = ACSP;
			break;
		case 2:
			typeC = EMC;
			break;
		case 3:
			typeC = IM;
			break;
		case 4:
			typeC = EGV;
		case 5:
			typeC = C;
			break;
		case 6:
			typeC = CAPYM;
			break;
		case 7:
			typeC = TAC;
			break;
		case 8:
			typeC = FSIC;
			break;
		case 9:
			typeC = CS;
			break;
		default:
			typeC = "Pendiente por asignar";
		}
		System.out.println("Nombre del representante legal:");
		nameLR = a.nextLine();
		nameLR = a.nextLine();
		System.out.println("Cantidad de empleados:");
		qEmployees = a.nextInt();
		System.out.println("Ingrese los activos (en pesos)");
		assets = a.nextDouble();
		System.out.println("__________________________________________________________________________________\n");

	}

	public static void main(String[] args) {

		Main m = new Main();

		System.out.println(" _________________________________________________________ ");
		System.out.println("|                                                         |");
		System.out.println("|                      HOLDING EMPRESARIAL                |");
		System.out.println("|_________________________________________________________| \n");

		do {

			m.menu();

			option = a.nextInt();

			switch (option) {
			case 1:

				System.out.println("###########################################################");
				System.out.println("#     Este es el menu para agregar una nueva empresa:     #");
				System.out.println("#                                                         #");
				System.out.println("# Por favor, ingrese el tipo de empresa a registrar:      #");
				System.out.println("#   1. Tecnologica                                        #");
				System.out.println("#   2. De Educacion                                       #");
				System.out.println("#   3. Fabricacion de productos varios                    #");
				System.out.println("#   4. Fabricacion de medicamentos                        #");
				System.out.println("#   5. Fabricacion de alimentos                           #");
				System.out.println("#   0. Volver al menu anterior                            #");
				System.out.println("###########################################################\n");

				option = a.nextInt();
				while (option != 0) {
					switch (option) {
					case 1:

						m.editLegalP();
						m.theHolding.gettCs().add(new TechnologyC(name, nit, adress, phone, dateCreation, typeC, nameLR,
								qEmployees, assets));

						do {
							System.out.println(
									"Numero de empresas tecnologicas registradas: " + m.theHolding.gettCs().size());
							iterator = 0;
							System.out.println("tamano de la lista de servicios: "
									+ m.theHolding.gettCs().get(iterator).getProvidedS().size());
							centinel = false;
							System.out.println("Ingrese el servicio prestado:");
							providedS = a.nextLine();
							providedS = a.nextLine();
							while (iterator < m.theHolding.gettCs().size() && centinel == false) {

								if (m.theHolding.gettCs().get(iterator).getName().equals(name) == true) {
									m.theHolding.gettCs().get(iterator).getProvidedS().add(providedS);
									centinel = true;
								}
								iterator++;
							}

							System.out.println("Desea agregar mas servicios?\n1. Si\n2. No");
							option1 = a.nextInt();

						} while (option1 == 1);

						System.out.println("Desea agregar mas empresas tecnologicas?\n1. Si\n2. No");
						option2 = a.nextInt();
						switch (option2) {
						case 1:
							m.editLegalP();
							m.theHolding.gettCs().add(new TechnologyC(name, nit, adress, phone, dateCreation, typeC,
									nameLR, qEmployees, assets));
							do {
								System.out.println(
										"Numero de empresas tecnologicas registradas: " + m.theHolding.gettCs().size());
								iterator = 0;
								System.out.println("tamano de la lista de servicios: "
										+ m.theHolding.gettCs().get(iterator).getProvidedS().size());
								centinel = false;
								System.out.println("Ingrese el servicio prestado:");
								providedS = a.nextLine();
								providedS = a.nextLine();
								while (iterator < m.theHolding.gettCs().size() && centinel == false) {

									if (m.theHolding.gettCs().get(iterator).getName().equals(name) == true) {
										m.theHolding.gettCs().get(iterator).getProvidedS().add(providedS);
										centinel = true;
									}
									iterator++;
								}

								System.out.println("Desea agregar mas servicios?\n1. Si\n2. No");
								option1 = a.nextInt();

							} while (option1 == 1);
							break;

						case 2:
							System.out.println(
									"Numero de empresas tecnologicas registradas: " + m.theHolding.gettCs().size());
							break;
						default:
							System.err.println("ERROR EN LA MATRIX.2%$#% --> ESCAPE DE AQUI%%$$");
						}

						break;
					case 2:
						do {
							m.editLegalP();
							System.out.println("Ingrese el numero de registro del Ministerio Nacional de Educacion");
							idMEN = a.nextLine();
							idMEN = a.nextLine();
							System.out.println("Anios de acreditacion:");
							yearsA = a.nextInt();
							System.out.println("Puesto que ocupa la institucion educativa (Segun Saber11)");
							ranking = a.nextInt();
							System.out.println("Nombre del rector(a):");
							directorN = a.nextLine();
							directorN = a.nextLine();
							System.out.println("No. de estudiantes de estractos socio-economicos 1 y 2:");
							qStudents12 = a.nextInt();
							System.out.println("No. total de estudiantes:");
							qTStudents = a.nextInt();

							m.theHolding.geteCs()
									.add(new EducationC(name, nit, adress, phone, dateCreation, typeC, nameLR,
											qEmployees, assets, idMEN, yearsA, ranking, directorN, educationS,
											qStudents12, qTStudents));
							System.out.println("Intitucion educativa agregada con exito");
							System.out.println("No. de intituciones educativas pertenecientes al holding: "
									+ m.theHolding.geteCs().size());
							System.out.println("Desea agregar mas intituciones educativas?\n1. Si\n2. No");
							option3 = a.nextInt();
						} while (option3 == 1);
						break;
					case 3:
						do {
							m.editLegalP();
							m.theHolding.getvCs().add(new VariousPC(name, nit, adress, phone, dateCreation, typeC,
									nameLR, qEmployees, assets));
							System.out.println(
									"A continuacion se le solicitara algunos datos del numero de productos que manofactura:\n");
							do {
								System.out.println("Ingrese el nombre del producto: ");
								nameP = a.nextLine();
								nameP = a.nextLine();
								System.out.println("ingrese el codigo de identificacion: ");
								idC = a.nextLine();
								System.out.println(
										"Ingrese la cantidad de agua que se utilizo en su fabricacion (Litros)");
								qWater = a.nextDouble();
								System.out.println(
										"Ingrese el numero de unidades de este producto que se encuentran en el inventario: ");
								qUnits = a.nextInt();
								iterator1 = 0;
								centinel1 = false;
								while (iterator1 < m.theHolding.getvCs().size() && centinel1 == false) {

									if (m.theHolding.getvCs().get(iterator1).getName().equals(name) == true) {
										System.out.println("Tamano de la lista de VP: " + m.theHolding.getvCs().size());
										System.out.println("Valor del iterador: " + iterator1);
										System.out.println("Entro a agregar productos");
										m.theHolding.getvCs().get(iterator1).getProducts()
												.add(new ProductsV(nameP, idC, qWater, qUnits));
										centinel = true;
									}
									iterator1++;
								}
								if (m.theHolding.getvCs() != null) {
									System.out.println("Numero de productos hasta ahora: "
											+ m.theHolding.getvCs().get(0).getProducts().size());
								}
								System.out.println("Desea agregar mas productos?\n1. Si\n2. No");
								option4 = a.nextInt();

							} while (option4 == 1);
							System.out.println("Desea agregar mas empresas de Fabricacion?\n1. Si\n2. No");
							option5 = a.nextInt();

						} while (option5 == 1);
						break;
					case 4:
						do {
							m.editLegalP();
							m.theHolding.getmCs().add(new MedicineC(name, nit, adress, phone, dateCreation, typeC,
									nameLR, qEmployees, assets));
							System.out.println(
									"A continuacion se le pediran los datos de los medicamentos que comercializa: \n");
							do {
								System.out.println("Ingrese el No. de registro sanitario:");
								sanitaryR = a.nextLine();
								sanitaryR = a.nextLine();
								System.out.println("Ingrese el estado de la licencia:\n1. Vigente\n2. No renovado");
								optStatus = a.nextInt();
								switch (optStatus) {
								case 1:
									status = true;
									break;
								case 2:
									status = false;
									break;
								}
								System.out.println("Ingrese la fecha de expiracion (MM-AAAA):");
								expiration = a.nextLine();
								expiration = a.nextLine();
								System.out.println(
										"Ingrese la modalidad:\n1. Fabricar y exportar\n2. Fabricar y vender\n3. Importar y vender");
								optMod = a.nextInt();
								switch (optMod) {
								case 1:
									modality = "Fabricar y exportar";
									break;
								case 2:
									modality = "Fabricar y vender";
									break;
								case 3:
									modality = "Importar y vender";
									break;
								}
								centinel2 = false;
								iterator4 = 0;
								while (iterator4 < m.theHolding.getmCs().size() && centinel2 == false) {

									if (m.theHolding.getmCs().get(iterator4).getName().equals(name) == true) {
										System.out.println(
												"Tamano de la lista de Farmaceuticas: " + m.theHolding.getmCs().size());
										System.out.println("Tamano de la lista de Medicamentos: "
												+ m.theHolding.getmCs().get(iterator4).getmPs().size());

										m.theHolding.getmCs().get(iterator4).getmPs()
												.add(new MProducts(sanitaryR, status, expiration, modality));
										centinel = true;
									}
									iterator4++;
								}
								System.out.println("Desea agregar mas medicamentos?\n1. Si\n2. No");
								option6 = a.nextInt();
							} while (option6 == 1);
							System.out.println("Desea agregar mas empresas farmaceuticas?\n1. Si\n2. No");
							option7 = a.nextInt();

						} while (option7 == 1);

						break;
					case 5:
						do {
							m.editLegalP();
							System.out.println("Ingrese No. de permiso INVIMA:");
							invCode = a.nextInt();
							System.out.println("Permiso sanitario:\n1. Vigente\n2. No vigente");
							option8 = a.nextInt();
							switch (option8) {
							case 1:
								sanitaryPer = true;
								break;
							case 2:
								sanitaryPer = false;
								break;
							}
							System.out.println("Certificado de Manipulacion de Alimentos:\n1. Si\n2. No");
							option8 = a.nextInt();
							switch (option8) {
							case 1:
								foodHandling = true;
								break;
							case 2:
								foodHandling = false;
								break;
							}
							m.theHolding.getfCs().add(new FoodC(name, nit, adress, phone, dateCreation, typeC, nameLR,
									qEmployees, assets, invCode, sanitaryPer, foodHandling));
							System.out.println("Desea agregar mas empresas de comestibles?\n1. Si\n2. No");
							option8 = a.nextInt();
						} while (option8 == 1);

						break;

					}
					option = 0;
				}

				break;

			case 2:

				System.out.println("<*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*>");
				System.out.println(m.theHolding.supeRString());
				System.out.println("<*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*>\n");

				break;

			}

			System.out.println(
					"Escoja la opcion que desea realizar?\n1. Cerrar el programa.\n2. Volver al menu principal.");
			backMenu = a.nextInt();
			if (backMenu == 1) {
				System.out.println(
						"Created by Cristhian Camilo Gutierrez Cordoba\nInfo and cheaps services : kamneklogs@gmail.com :3");
			}
		} while (backMenu != 1);

	}

}