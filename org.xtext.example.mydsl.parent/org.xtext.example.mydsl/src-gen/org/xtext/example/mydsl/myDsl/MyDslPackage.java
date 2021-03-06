/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Includes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__INCLUDES = 0;

  /**
   * The feature id for the '<em><b>Planes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PLANES = 1;

  /**
   * The feature id for the '<em><b>Airports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__AIRPORTS = 2;

  /**
   * The feature id for the '<em><b>Airlines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__AIRLINES = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.IncludesImpl <em>Includes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.IncludesImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIncludes()
   * @generated
   */
  int INCLUDES = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDES__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Includes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PlaneImpl <em>Plane</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PlaneImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPlane()
   * @generated
   */
  int PLANE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANE__NAME = 0;

  /**
   * The feature id for the '<em><b>Passengers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANE__PASSENGERS = 1;

  /**
   * The feature id for the '<em><b>Motorisation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANE__MOTORISATION = 2;

  /**
   * The number of structural features of the '<em>Plane</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AirportImpl <em>Airport</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AirportImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAirport()
   * @generated
   */
  int AIRPORT = 3;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIRPORT__TITLE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIRPORT__NAME = 1;

  /**
   * The feature id for the '<em><b>Country</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIRPORT__COUNTRY = 2;

  /**
   * The feature id for the '<em><b>Runways</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIRPORT__RUNWAYS = 3;

  /**
   * The number of structural features of the '<em>Airport</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIRPORT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AirlineImpl <em>Airline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AirlineImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAirline()
   * @generated
   */
  int AIRLINE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIRLINE__NAME = 0;

  /**
   * The feature id for the '<em><b>Plane</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIRLINE__PLANE = 1;

  /**
   * The feature id for the '<em><b>Company</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIRLINE__COMPANY = 2;

  /**
   * The feature id for the '<em><b>Departure</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIRLINE__DEPARTURE = 3;

  /**
   * The feature id for the '<em><b>Arrival</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIRLINE__ARRIVAL = 4;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIRLINE__DURATION = 5;

  /**
   * The feature id for the '<em><b>Regular</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIRLINE__REGULAR = 6;

  /**
   * The number of structural features of the '<em>Airline</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIRLINE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CodeOACIImpl <em>Code OACI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CodeOACIImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCodeOACI()
   * @generated
   */
  int CODE_OACI = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_OACI__NAME = 0;

  /**
   * The number of structural features of the '<em>Code OACI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_OACI_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.Engines <em>Engines</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.Engines
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEngines()
   * @generated
   */
  int ENGINES = 6;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Model#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Includes</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model#getIncludes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Includes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Model#getPlanes <em>Planes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Planes</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model#getPlanes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Planes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Model#getAirports <em>Airports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Airports</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model#getAirports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Airports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Model#getAirlines <em>Airlines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Airlines</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model#getAirlines()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Airlines();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Includes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Includes</em>'.
   * @see org.xtext.example.mydsl.myDsl.Includes
   * @generated
   */
  EClass getIncludes();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Includes#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.xtext.example.mydsl.myDsl.Includes#getImportURI()
   * @see #getIncludes()
   * @generated
   */
  EAttribute getIncludes_ImportURI();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Plane <em>Plane</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plane</em>'.
   * @see org.xtext.example.mydsl.myDsl.Plane
   * @generated
   */
  EClass getPlane();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Plane#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Plane#getName()
   * @see #getPlane()
   * @generated
   */
  EAttribute getPlane_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Plane#getPassengers <em>Passengers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Passengers</em>'.
   * @see org.xtext.example.mydsl.myDsl.Plane#getPassengers()
   * @see #getPlane()
   * @generated
   */
  EAttribute getPlane_Passengers();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Plane#getMotorisation <em>Motorisation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Motorisation</em>'.
   * @see org.xtext.example.mydsl.myDsl.Plane#getMotorisation()
   * @see #getPlane()
   * @generated
   */
  EAttribute getPlane_Motorisation();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Airport <em>Airport</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Airport</em>'.
   * @see org.xtext.example.mydsl.myDsl.Airport
   * @generated
   */
  EClass getAirport();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Airport#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.xtext.example.mydsl.myDsl.Airport#getTitle()
   * @see #getAirport()
   * @generated
   */
  EAttribute getAirport_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Airport#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Airport#getName()
   * @see #getAirport()
   * @generated
   */
  EReference getAirport_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Airport#getCountry <em>Country</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Country</em>'.
   * @see org.xtext.example.mydsl.myDsl.Airport#getCountry()
   * @see #getAirport()
   * @generated
   */
  EAttribute getAirport_Country();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Airport#getRunways <em>Runways</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Runways</em>'.
   * @see org.xtext.example.mydsl.myDsl.Airport#getRunways()
   * @see #getAirport()
   * @generated
   */
  EAttribute getAirport_Runways();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Airline <em>Airline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Airline</em>'.
   * @see org.xtext.example.mydsl.myDsl.Airline
   * @generated
   */
  EClass getAirline();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Airline#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Airline#getName()
   * @see #getAirline()
   * @generated
   */
  EAttribute getAirline_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Airline#getPlane <em>Plane</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Plane</em>'.
   * @see org.xtext.example.mydsl.myDsl.Airline#getPlane()
   * @see #getAirline()
   * @generated
   */
  EReference getAirline_Plane();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Airline#getCompany <em>Company</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Company</em>'.
   * @see org.xtext.example.mydsl.myDsl.Airline#getCompany()
   * @see #getAirline()
   * @generated
   */
  EAttribute getAirline_Company();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Airline#getDeparture <em>Departure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Departure</em>'.
   * @see org.xtext.example.mydsl.myDsl.Airline#getDeparture()
   * @see #getAirline()
   * @generated
   */
  EReference getAirline_Departure();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Airline#getArrival <em>Arrival</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Arrival</em>'.
   * @see org.xtext.example.mydsl.myDsl.Airline#getArrival()
   * @see #getAirline()
   * @generated
   */
  EReference getAirline_Arrival();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Airline#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Airline#getDuration()
   * @see #getAirline()
   * @generated
   */
  EAttribute getAirline_Duration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Airline#isRegular <em>Regular</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Regular</em>'.
   * @see org.xtext.example.mydsl.myDsl.Airline#isRegular()
   * @see #getAirline()
   * @generated
   */
  EAttribute getAirline_Regular();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.CodeOACI <em>Code OACI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code OACI</em>'.
   * @see org.xtext.example.mydsl.myDsl.CodeOACI
   * @generated
   */
  EClass getCodeOACI();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.CodeOACI#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.CodeOACI#getName()
   * @see #getCodeOACI()
   * @generated
   */
  EAttribute getCodeOACI_Name();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl.Engines <em>Engines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Engines</em>'.
   * @see org.xtext.example.mydsl.myDsl.Engines
   * @generated
   */
  EEnum getEngines();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__INCLUDES = eINSTANCE.getModel_Includes();

    /**
     * The meta object literal for the '<em><b>Planes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PLANES = eINSTANCE.getModel_Planes();

    /**
     * The meta object literal for the '<em><b>Airports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__AIRPORTS = eINSTANCE.getModel_Airports();

    /**
     * The meta object literal for the '<em><b>Airlines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__AIRLINES = eINSTANCE.getModel_Airlines();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.IncludesImpl <em>Includes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.IncludesImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIncludes()
     * @generated
     */
    EClass INCLUDES = eINSTANCE.getIncludes();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDES__IMPORT_URI = eINSTANCE.getIncludes_ImportURI();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PlaneImpl <em>Plane</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PlaneImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPlane()
     * @generated
     */
    EClass PLANE = eINSTANCE.getPlane();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLANE__NAME = eINSTANCE.getPlane_Name();

    /**
     * The meta object literal for the '<em><b>Passengers</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLANE__PASSENGERS = eINSTANCE.getPlane_Passengers();

    /**
     * The meta object literal for the '<em><b>Motorisation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLANE__MOTORISATION = eINSTANCE.getPlane_Motorisation();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AirportImpl <em>Airport</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AirportImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAirport()
     * @generated
     */
    EClass AIRPORT = eINSTANCE.getAirport();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AIRPORT__TITLE = eINSTANCE.getAirport_Title();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AIRPORT__NAME = eINSTANCE.getAirport_Name();

    /**
     * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AIRPORT__COUNTRY = eINSTANCE.getAirport_Country();

    /**
     * The meta object literal for the '<em><b>Runways</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AIRPORT__RUNWAYS = eINSTANCE.getAirport_Runways();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AirlineImpl <em>Airline</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AirlineImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAirline()
     * @generated
     */
    EClass AIRLINE = eINSTANCE.getAirline();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AIRLINE__NAME = eINSTANCE.getAirline_Name();

    /**
     * The meta object literal for the '<em><b>Plane</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AIRLINE__PLANE = eINSTANCE.getAirline_Plane();

    /**
     * The meta object literal for the '<em><b>Company</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AIRLINE__COMPANY = eINSTANCE.getAirline_Company();

    /**
     * The meta object literal for the '<em><b>Departure</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AIRLINE__DEPARTURE = eINSTANCE.getAirline_Departure();

    /**
     * The meta object literal for the '<em><b>Arrival</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AIRLINE__ARRIVAL = eINSTANCE.getAirline_Arrival();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AIRLINE__DURATION = eINSTANCE.getAirline_Duration();

    /**
     * The meta object literal for the '<em><b>Regular</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AIRLINE__REGULAR = eINSTANCE.getAirline_Regular();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CodeOACIImpl <em>Code OACI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CodeOACIImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCodeOACI()
     * @generated
     */
    EClass CODE_OACI = eINSTANCE.getCodeOACI();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CODE_OACI__NAME = eINSTANCE.getCodeOACI_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.Engines <em>Engines</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.Engines
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEngines()
     * @generated
     */
    EEnum ENGINES = eINSTANCE.getEngines();

  }

} //MyDslPackage
