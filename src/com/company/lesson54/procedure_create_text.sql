create or replace procedure myschema.transfer(
	out receiver_name text ,
	in receiver_id int )
as $$
begin
select "name"  into receiver_name from myschema.accounts
where id=receiver_id;
end;$$
language plpgsql ;


create function myschema.transferfun(receiver_id int)
    returns varchar
    language plpgsql
as $$
declare
receiver_name varchar;
begin
select "name"  into receiver_name from myschema.accounts
where id=receiver_id;
return receiver_name;
end;$$;






