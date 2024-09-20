 fun main (args: Array<String>){
        /*VARIABLES*/
        var curse = "Desarrollo Movile 1";
        var credit : Int =5;
        var Shop : Double = 1550.90;
        var active : Boolean
        active = true;

        /*CONSTANCIA*/
        val theme : String = "Fundamentos de Kotlin";
        //theme = "POO";
        println(curse)

        condicionalDouble("Polleri", "Llalleri");
        ejemploCaso("Davor",);
        println(validarNumero(21));
     Temperatura()
    }
    /*Fuciones*/
    fun condicionalDouble(LastName1: String, LastName2: String){
    var ResultApe= if(LastName1.length > LastName2.length){
    }else if(LastName2.length > LastName1.length ){
        LastName2
    }else{
        "Apellidos con longitud igual"
    }
        println(ResultApe)
    }

    fun ejemploCaso(nombre : String){
        when (nombre.length){
            0 -> println("Nombre vacio");
            in 1 .. 4 -> println("Nombre pequeño");
            in 5 .. 7 -> println("Nombre meidano");
            else -> println("Nombre exteso")
        }
    }
public fun validarNumero(numero : Int): String{
    when (numero % 2){
        0-> return "Numero par"
        else -> return "Numero Impar"
    }
}
    fun promedio(nota1 : Int,
                 nota2 : Int,
                 nota3 : Int,
                 sumarNotaMayor : Boolean):Double {
        var NotaMayor = if (nota1 > nota2 && nota1 >= nota3){
            nota1
        }else if(nota2 > nota1 && nota2 >= nota3){
            nota2
        }else if(nota3 > nota1 || nota3 >= nota2){
            nota3
        }else{
            nota1
        }
        if (!sumarNotaMayor){
            return (nota1 + nota2 + nota3

                    + NotaMayor).toDouble() / 4
        }else {
            return (nota1 + nota2 + nota3).toDouble() / 3
        }
        fun Temperatura() {
            var tF = 80;
            println("La temperatura F es :"+tF);
            var tC=(tF-32)*5/9;
            println("La temperatura C es :" + tC);
        }

    }

    /*PRACTICA01*/


