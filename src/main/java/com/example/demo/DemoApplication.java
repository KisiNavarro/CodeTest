package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@SpringBootApplication
@EnableTransactionManagement
//@EnableDiscoveryClient

@EnableDiscoveryClient
@ComponentScan(basePackages = {
		"com.example.demo"
})
@EntityScan(basePackages = {
		"com.example.demo"
})
@EnableJpaRepositories(basePackages = {
		"com.example.demo"
})

public class DemoApplication {

//	@Autowired
//	static UsuarioRepository repository = new UsuarioRepository() {
//		@Override
//		public List<Usuario> findByapellido(String apellido) {
//			return List.of();
//		}
//
//		@Override
//		public void flush() {
//
//		}
//
//		@Override
//		public <S extends Usuario> S saveAndFlush(S entity) {
//			return null;
//		}
//
//		@Override
//		public <S extends Usuario> List<S> saveAllAndFlush(Iterable<S> entities) {
//			return List.of();
//		}
//
//		@Override
//		public void deleteAllInBatch(Iterable<Usuario> entities) {
//
//		}
//
//		@Override
//		public void deleteAllByIdInBatch(Iterable<Long> longs) {
//
//		}
//
//		@Override
//		public void deleteAllInBatch() {
//
//		}
//
//		@Override
//		public Usuario getOne(Long aLong) {
//			return null;
//		}
//
//		@Override
//		public Usuario getById(Long aLong) {
//			return null;
//		}
//
//		@Override
//		public Usuario getReferenceById(Long aLong) {
//			return null;
//		}
//
//		@Override
//		public <S extends Usuario> List<S> findAll(Example<S> example) {
//			return List.of();
//		}
//
//		@Override
//		public <S extends Usuario> List<S> findAll(Example<S> example, Sort sort) {
//			return List.of();
//		}
//
//		@Override
//		public <S extends Usuario> List<S> saveAll(Iterable<S> entities) {
//			return List.of();
//		}
//
//		@Override
//		public List<Usuario> findAll() {
//			return List.of();
//		}
//
//		@Override
//		public List<Usuario> findAllById(Iterable<Long> longs) {
//			return List.of();
//		}
//
//		@Override
//		public <S extends Usuario> S save(S entity) {
//			return null;
//		}
//
//		@Override
//		public Optional<Usuario> findById(Long aLong) {
//			return Optional.empty();
//		}
//
//		@Override
//		public boolean existsById(Long aLong) {
//			return false;
//		}
//
//		@Override
//		public long count() {
//			return 0;
//		}
//
//		@Override
//		public void deleteById(Long aLong) {
//
//		}
//
//		@Override
//		public void delete(Usuario entity) {
//
//		}
//
//		@Override
//		public void deleteAllById(Iterable<? extends Long> longs) {
//
//		}
//
//		@Override
//		public void deleteAll(Iterable<? extends Usuario> entities) {
//
//		}
//
//		@Override
//		public void deleteAll() {
//
//		}
//
//		@Override
//		public List<Usuario> findAll(Sort sort) {
//			return List.of();
//		}
//
//		@Override
//		public Page<Usuario> findAll(Pageable pageable) {
//			return null;
//		}
//
//		@Override
//		public <S extends Usuario> Optional<S> findOne(Example<S> example) {
//			return Optional.empty();
//		}
//
//		@Override
//		public <S extends Usuario> Page<S> findAll(Example<S> example, Pageable pageable) {
//			return null;
//		}
//
//		@Override
//		public <S extends Usuario> long count(Example<S> example) {
//			return 0;
//		}
//
//		@Override
//		public <S extends Usuario> boolean exists(Example<S> example) {
//			return false;
//		}
//
//		@Override
//		public <S extends Usuario, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//			return null;
//		}
//	};

	//static MysqlConnection conn;






	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


	}


}
