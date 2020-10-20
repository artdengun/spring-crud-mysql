$('document').ready(function(){
   $('table #editButton').on('click', function (event){
      event.preventDefault();
        
        var href = $(this).attr('href');
       
        $.get(href, function (country, status) {
        
        $('#idEdit').val(country.id);
        $("#namaEdit").val(country.nama);
        $('#asalEdit').val(country.asal);
        $('#emailEdit').val(country.email);
        $('#alamatEdit').val(country.alamat);
       });
       $('#editModal').modal();
   });
    
    
    $('table #deleteButton').on('click', function(){
        event.preventDefault();
        
        var href = $(this).attr('href');
        
        $('#confirmDeleteButton').attr('href', href);
        $('#deleteModal').modal();  
    });
});