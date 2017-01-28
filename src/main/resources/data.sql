insert into authority values ('ADMIN');
insert into authority values ('USER');
insert into authority values ('MANAGE');

insert into user_api (id, login, password_hash) values (1, 'admin', '$2a$10$7XNYzua.2JAyPE2k/1pgj.6Rnguz4PhC.DiuT6CNNKYALPs4V5piy');
insert into user_api (id, login, password_hash) values (2, 'user', '$2a$10$1PFM0QMlt4sDR2EJW9DEn.gam4VwtJHrSGiMowcbeAc8/Dd1Kegji');
insert into user_api (id, login, password_hash) values (3, 'manage', '$2a$10$7JLoggK7lcIUfUnkxp6Te.vGqU9CG0q/qFojFr6P0RYFJvEFTCSQa');

insert into user_authority (user_id, authority_name) values (1,1);
insert into user_authority (user_id, authority_name) values (2,2);
insert into user_authority (user_id, authority_name) values (3,3);

