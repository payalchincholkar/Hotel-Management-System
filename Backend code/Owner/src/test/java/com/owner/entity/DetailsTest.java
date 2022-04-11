package com.owner.entity;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.owner.OwnerApplication;

class DetailsTest {

	static Details det = new Details();

    @Test
    void getId() {
        det.setId(2);
        assertEquals(2,det.getId());
    }

    @Test
    void getDepartmentName() {
        det.setDepartmentName("hdj");
        assertEquals("hdj",det.getDepartmentName());
    }



    @Test
    void getNoOfMember() {
        det.setNoOfMember(23);
        assertEquals(23,det.getNoOfMember());
    }
    @Test
    void construct() {
        Details det2=new Details(2,"jfj",34);

    }
    @Test
    void testmain()
    {
        String args[] = {""};
        OwnerApplication.main(args);

    }


}