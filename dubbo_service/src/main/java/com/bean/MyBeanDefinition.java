package com.bean;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class MyBeanDefinition extends RootBeanDefinition {

    String name ="zhangxinak" ;

    public void setParentName(String parentName) {

    }

    public String getParentName() {
        return null;
    }

    public void setBeanClassName(String beanClassName) {

    }

    public String getBeanClassName() {
        return null;
    }

    public void setScope(String scope) {

    }

    public String getScope() {
        return null;
    }

    public void setLazyInit(boolean lazyInit) {

    }

    public boolean isLazyInit() {
        return false;
    }

    public void setDependsOn(String... dependsOn) {

    }

    public String[] getDependsOn() {
        return new String[0];
    }

    public void setAutowireCandidate(boolean autowireCandidate) {

    }

    public boolean isAutowireCandidate() {
        return false;
    }

    public void setPrimary(boolean primary) {

    }

    public boolean isPrimary() {
        return false;
    }

    public void setFactoryBeanName(String factoryBeanName) {

    }

    public String getFactoryBeanName() {
        return null;
    }

    public void setFactoryMethodName(String factoryMethodName) {

    }

    public String getFactoryMethodName() {
        return null;
    }

    public ConstructorArgumentValues getConstructorArgumentValues() {
        return null;
    }

    public MutablePropertyValues getPropertyValues() {
        return null;
    }

    public boolean isSingleton() {
        return false;
    }

    public boolean isPrototype() {
        return false;
    }

    public boolean isAbstract() {
        return false;
    }

    public int getRole() {
        return 0;
    }

    public String getDescription() {
        return null;
    }

    public String getResourceDescription() {
        return null;
    }

    public BeanDefinition getOriginatingBeanDefinition() {
        return null;
    }

    public Object getSource() {
        return null;
    }

    public void setAttribute(String name, Object value) {

    }

    public Object getAttribute(String name) {
        return null;
    }

    public Object removeAttribute(String name) {
        return null;
    }

    public boolean hasAttribute(String name) {
        return false;
    }

    public String[] attributeNames() {
        return new String[0];
    }
}
