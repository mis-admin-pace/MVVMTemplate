package app.web.drjackycv.domain.products.usecase

import androidx.paging.PagingData
import app.web.drjackycv.domain.base.usecase.GeneralUseCase
import app.web.drjackycv.domain.products.entity.Beer
import app.web.drjackycv.domain.products.repository.ProductsListRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetBeersListByCoroutineUseCase @Inject constructor(
    private val productsListRepository: ProductsListRepository,
) : GeneralUseCase<Flow<PagingData<Beer>>, Unit> {

    override fun invoke(params: Unit): Flow<PagingData<Beer>> =
        productsListRepository.getBeersListByCoroutine()

}