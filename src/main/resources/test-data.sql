insert into contact (id, first_name, last_name,  birth_date) values (1, 'As', 'Assov', '1990-12-12');
insert into contact (id, first_name, last_name,  birth_date) values (2, 'Bs', 'Bssov', '1990-12-12');
insert into contact (id, first_name, last_name,  birth_date) values (3, 'Ds', 'Dssov', '1990-12-12');

insert into hobby (id, contact_id, title, description) values (1, 2, 'Fishing', 'Fishing - Life');
insert into hobby (id, contact_id, title, description) values (2, 1, 'Football', 'Good hobby');
insert into hobby (id, contact_id, title, description) values (3, 3, 'Rally', 'Speed Cars');

insert into place (id, contact_id, title, description, longitude, latitude) values (1, 2, 'Dnepr', 'My city', '25.22', '36.68');
insert into place (id, contact_id, title, description, longitude, latitude) values (2, 3, 'Kiew', 'Country Ukraine', '5.24', '65.32');
insert into place (id, contact_id, title, description, longitude, latitude) values (3, 1, 'Odessa', 'Good hobby', '65.5', '89.5');



