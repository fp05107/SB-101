package Question_1;

/*
 * 
 *      Statement	                                           PreparedStatement
It is used when SQL query is to be executed only once.	It is used when SQL query is to be executed multiple times.
You can not pass parameters at runtime.	                You can pass parameters at runtime.
Used for CREATE, ALTER, DROP statements.	            Used for the queries which are to be executed multiple times.
Performance is very low.	                            Performance is better than Statement.
It is base interface.	                                It extends statement interface.
Used to execute normal SQL queries.	                    Used to execute dynamic SQL queries.
We can not use statement for reading binary data.	    We can use Preparedstatement for reading binary data.
It is used for DDL statements.	                        It is used for any SQL Query.
We can not use statement for writing binary data.	    We can use Preparedstatement for writing binary data.
No binary protocol is used for communication.	        Binary protocol is used for communication.
 * 
 */
public class Demo {

}
