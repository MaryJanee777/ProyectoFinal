(function(){
    var listaBotonesEditar = document.querySelectorAll(".editarPersona");
    listaBotonesEditar.forEach(item =>{
        item.addEventListener("click", e =>{
            //alert("Hiciste click en el boton");
            document.getElementById("id").value = item.dataset.id;
            document.getElementById("txtNombre").value = item.dataset.nombre;
            document.getElementById("txtApellido").value = item.dataset.apellido;
            document.getElementById("txtNumero").value = item.dataset.numero;
            new bootstrap.Modal(document.getElementById('modalEditar')).show();
        });
    });
})();