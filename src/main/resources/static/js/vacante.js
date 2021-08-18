/*Scripts tipo Ajax solo guardar*/
$(document).ready(function (){
        cargarVacantes();
    $("#vacante").DataTable();
});
        async function  cargarVacantes(){
        const request = await fetch('vacantes',{
            method:'GET',
            headers:{
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
        });
        const vacantes = await request.json();
        console.log(vacantes);
    }