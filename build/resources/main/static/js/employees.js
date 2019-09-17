$(document).ready(function(){
	
	$.ajax({
		url: '/get_all_employees',
		type: 'POST',
		dataType: 'json',
		success: function(data){

				var table_employees = $("#table_employees");

				$.each(data, function(index, element) {

            		var tr_employee = $("<tr>");

            		var td_id = $("<td>").append("" + element.id);
            		var td_fio = $("<td>").append("" + element.fio); 
            		var td_phone_number = $("<td>").append("" + element.phoneNumber);
            		var td_position = $("<td>").append("" + element.position);

            		tr_employee.append(td_id);
            		tr_employee.append(td_fio);
            		tr_employee.append(td_phone_number);
            		tr_employee.append(td_position);

					table_employees.append(tr_employee);
   				}); 
   		},
   		error: function(error){
         		alert("Ошибка соединения с базой данных Сотрудников !!!");
      	}		
	});
	

});