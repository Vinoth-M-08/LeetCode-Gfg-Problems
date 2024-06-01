# Write your MySQL query statement below
select id ,movie,description,rating from Cinema
where MOD(id,2)!=0 && description!='boring'
order by rating desc;