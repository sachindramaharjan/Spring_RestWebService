package com.sctrcd.multidsdemo.integration.repositories.foo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sctrcd.multidsdemo.domain.foo.Foo;

public interface FooRepository extends JpaRepository<Foo, Long> {

}
