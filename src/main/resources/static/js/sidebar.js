$(document).ready(function(){

	/*
		При нажатии на кнопку бокового меню "Услуги"
		делает активной только блок "Услуги"
		и оставляет эффект нажатия бокового меню "Услуги"
	*/
	$("#sidebar_menu_services").on('click', function(event) {

		$("#block_services").show();
		$('#block_employees').hide();

		$(this).addClass('active');

		$("#sidebar_menu_employees").removeClass('active');
	});

	/*
		При нажатии на кнопку бокового меню "Сотрудники"
		делает активной только блок "Сотрудники"
		и оставляет эффект нажатия бокового меню "Сотрудники"
	*/
	$("#sidebar_menu_employees").on('click', function(event) {

		$("#block_employees").show();
		$('#block_services').hide();
		
		$(this).addClass('active');
		$("#sidebar_menu_services").removeClass('active');
	});

});