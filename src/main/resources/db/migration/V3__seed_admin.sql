insert into users(username, password_hash, enabled)
values (
           'admin',
           '$2a$10$snAS3R9pCClztVp18ZLCTedEN9wGuU6/UZE.SJ6NJ/A99ExLi6T.O',
           true
       )
    on conflict (username) do nothing;

insert into user_roles(user_id, role_id)
select u.id, r.id
from users u
         join roles r on r.name = 'ROLE_ADMIN'
where u.username = 'admin'
    on conflict do nothing;