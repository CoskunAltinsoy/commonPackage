package com.kodlamaio.commonpackage.utils.constants;

public class Roles {
    public final static String Admin = "hasRole('admin')";
    public final static String User = "hasRole('user')";
    public final static String UserOrAdmin = "hasRole('user') or hasRole('admin')";
    public final static String UserAndAdmin = "hasRole('user') and hasRole('admin')";
}
