package com.testSuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ineditos.cafezinho.post.testCases.PostImagemSpoilerTestCase;
import com.ineditos.cafezinho.post.testCases.PostImagemeTextoSpoilerTestCase;
import com.ineditos.cafezinho.post.testCases.PostImagensSpoilerTestCase;
import com.ineditos.cafezinho.post.testCases.PostNaoSpoilerApenasImagemTestCase;
import com.ineditos.cafezinho.post.testCases.PostNaoSpoilerApenasTextoTestCase;
import com.ineditos.cafezinho.post.testCases.PostNaoSpoilercomImagemeTextoTestCase;
import com.ineditos.cafezinho.post.testCases.PostTextoSpoilerTestCase;
import com.utils.Report;

@RunWith(Suite.class)
@SuiteClasses({
	PostImagemeTextoSpoilerTestCase.class,
	PostImagemSpoilerTestCase.class,
	PostImagensSpoilerTestCase.class,
	PostNaoSpoilerApenasImagemTestCase.class,
	PostNaoSpoilerApenasTextoTestCase.class,
	PostNaoSpoilercomImagemeTextoTestCase.class,
	PostTextoSpoilerTestCase.class
})

public class PostsCafezinhoIneditosTestSuite {
	
	public static void main(String[] args) {
		JUnitCore.runClasses(PostsCafezinhoIneditosTestSuite.class);
	}
	
	@BeforeClass
	public static void setUp() {
		Report.create("Aplicativo Android TagLivros", "Suite de Regressão de Posts no Cafezinho: Clube Inéditos.");
	}

	@AfterClass
	public static void tearDown() {
		Report.close();
	}

}
