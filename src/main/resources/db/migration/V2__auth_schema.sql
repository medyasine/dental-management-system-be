create table users (
                       id bigserial primary key,
                       username varchar(120) not null unique,
                       password_hash varchar(255) not null,
                       enabled boolean not null default true,
                       created_at timestamp not null default now()
);

create table roles (
                       id bigserial primary key,
                       name varchar(50) not null unique
);

create table user_roles (
                            user_id bigint not null references users(id) on delete cascade,
                            role_id bigint not null references roles(id) on delete cascade,
                            primary key (user_id, role_id)
);

insert into roles(name) values ('ROLE_ADMIN') on conflict do nothing;
insert into roles(name) values ('ROLE_DENTIST') on conflict do nothing;
insert into roles(name) values ('ROLE_ASSISTANT') on conflict do nothing;
insert into roles(name) values ('ROLE_RECEPTIONIST') on conflict do nothing;