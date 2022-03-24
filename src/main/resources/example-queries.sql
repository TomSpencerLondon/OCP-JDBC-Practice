insert into EXHIBITS
VALUES(3, 'Asian Elephant', 7.5);

select * from EXHIBITS where id = 3;

select name, NUM_ACRES
from EXHIBITS
where id = 3;

select count(*), sum(NUM_ACRES)
from EXHIBITS;

update EXHIBITS
set NUM_ACRES = NUM_ACRES + .5
where name = 'Asian Elephant';

update EXHIBITS
set NUM_ACRES = NUM_ACRES - .5
where name = 'Asian Elephant';

delete from EXHIBITS
where name = 'Asian Elephant';

select * from EXHIBITS;