truncate table app_reference;
truncate table broker;

insert into app_reference (domain, code, display_value)
values ('ROLE', 'A', 'Role A');

insert into app_reference (domain, code, display_value)
values ('ROLE', 'B', 'Role B');

insert into app_reference (domain, code, display_value)
values ('SHIP', 'A', 'SHIP B');
insert into app_reference (domain, code, display_value)
values ('SHIP', 'B', 'SHIP B');
insert into app_reference (domain, code, display_value)
values ('SHIP', 'C', 'SHIP 3');


insert into broker (name, broker_role)
values ('John', 'A');

insert into broker (name, broker_role)
values ('Drew', 'B');

