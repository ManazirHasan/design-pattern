package org.asrs;

import java.beans.Transient;
import java.io.Serializable;
//it is data container //reduce boiler plate code
record RecordCl(@Transient  int id, String name, String lastName) implements Serializable{} ;

