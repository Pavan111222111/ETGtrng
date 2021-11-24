select empno
from jobhist
union
select empno
from EMP
order by empno desc;

SELECT EMPNO , hiredate as 'STARTDATE'
FROM EMP
UNION all
SELECT EMPNO, STARTDATE
FROM JOBHIST
WHERE ENDDATE IS NOT NULL
ORDER BY STARTDATE;


SELECT EMPNO,JOB
FROM EMP
WHERE JOB like 'SALES%'
UNION
SELECT EMPNO,JOB
FROM JOBHIST
WHERE JOB like 'SALES%'


SELECT
EMP.EMPNO,EMP.ENAME,JOBHIST.STARTDATE,JOBHIST.ENDDATE
FROM EMP JOIN JOBHIST
ON JOBHIST.DEPTNO=EMP.DEPTNO
EXCEPT
SELECT
EMP.EMPNO,EMP.ENAME,JOBHIST.STARTDATE,JOBHIST.ENDDATE
FROM EMP JOIN JOBHIST
ON JOBHIST.DEPTNO=EMP.DEPTNO
WHERE JOBHIST.ENDDATE IS NULL
ORDER BY JOBHIST.STARTDATE;


select e.empno,e.ENAME,j.startdate,j.enddate,j.chgdesc,j.comm
from emp e
full outer join
jobhist j
on(e.empno=j.empno)
where j.enddate is not null and e.empno in (select empno
                   from emp
				   union
				   select empno
				   from jobhist)
				   order by j.startdate


select e.ename,e.empno,d.deptno,d.DNAME
from dept d
full outer join
emp e
on(d.DEPTNO = e.deptno)
where d.deptno in (select d.deptno
                   from dept d
				   union
				   select e.deptno
				   from emp e)