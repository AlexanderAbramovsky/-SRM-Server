CREATE TABLE Parents (
	

	parent_Id int NOT NULL,

	surname varchar(100) NOT NULL,

	name varchar(100) NOT NULL,

	middleName varchar(100) NOT NULL,

	phoneNumber varchar(20) NOT NULL,

	contactPhoneNumber varchar(20) NOT NULL,



	passportSeries varchar(10) NOT NULL,

	passportID varchar(10) NOT NULL,

	passportIssuedBy varchar(255) NOT NULL,

	passportIssueDate varchar(20) NOT NULL,

	unitCode varchar(20) NOT NULL,



	dateContract varchar(20) NOT NULL,

	contractNumber varchar(100) NOT NULL,



	childrenId varchar(255) NOT NULL,

PRIMARY KEY (parent_Id)
)



insert into Parents VALUES (null, "Абрамовский", "Александр", "Владимирович", '89237795552',
							'89237795552', '1111', '123456', 'Отделением УФМС РОССИИ ПО АЛТАЙСКОМУ КРАЮ',
							'22.09.2019', '220 - 05', '22.09.2019', '123456789101112', '11,12,13');