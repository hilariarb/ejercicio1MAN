package org.example;
import java.util.List;
public class Person {
    private final String name;
    private final int age;
    private final String gender; //Male, Female


    /*
    Constructs a Person with a name, age and gender
    @param name : the name of the person
    @param age : the age of the person
    @param gender : the gender of the person
     */
    public Person(String name, int age, String gender){

        isNameCorrect(name);
        this.name = name;

        isAgeCorrect(age);
        this.age = age;
    }

    /*
        Comprueba que el nombre aportado en el constructor es correcto,
        en caso contrario, se crea una excepcion
     */
    private void isNameCorrect(String name){

        /*
        Comprueba que el nombre no es nulo y tiene longitud minima 2 */
        if(name!=null && name.length()>1){
            char checking;
            boolean enoughVowels = false;
            boolean enoughCons = false;

            /*
            Comprueba que cada caracter del String es una letra o un espacio */
            for(int i =0; i<name.length(); i++){
                checking = name.charAt(i);

                if( !(checking>='A' && checking<='Z')
                        && !(checking>='a' && checking<='z')
                        && checking!=' '
                ){
                    throw new RuntimeException("El nombre contiene caracteres especiales");
                /*
                Compueba que hay minimo una vocal y una consonante */
                }else if(checking=='A' || checking=='E' || checking=='I' || checking=='O' || checking=='U' ||
                            checking=='a' || checking=='e' || checking=='i' || checking=='o' || checking=='u'){
                        enoughVowels = true;
                }else if (checking!=' ') {
                    enoughCons = true;
                }
            }

            if(!enoughVowels || !enoughCons){
                throw new RuntimeException("El nombre no contiene suficientes vocales o consonantes");
            }
        }else {
            throw new RuntimeException("El nombre no contiene suficientes caracteres");
        }
    }


    /*
        Comprueba que la edad aportada en el constructor este en un rango valido.
        Se considera la edad maxima 120.
        En caso de no estar entre el rango valido, se crea una Excepcion
    */
    private void isAgeCorrect(int age){
        if(age<0 || age>120){
            throw new RuntimeException("La edad tiene un valor no valido");
        }
    }



    public String name(){
        return name;
    }

    public int age(){
        return age;
    }

    public String gender(){
        return gender;
    }


    /*
    Computes average age of male and female persons in a list and returns the result
    in an array of two elements: the first element is the male mean age and the
    second one is the female mean age
    @param persons
    @return
     */
    public static double[] averageAgePerGender(List<Person> persons)throws RuntimeException{
        
}
