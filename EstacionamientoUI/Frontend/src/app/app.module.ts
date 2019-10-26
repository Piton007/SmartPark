import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CrearAdministradorComponent } from './crear-administrador/crear-administrador.component';
import { DetalleAdministradorComponent } from './detalle-administrador/detalle-administrador.component';
import { ListaAdministradorComponent } from './lista-administrador/lista-administrador.component';
import { BuscarAdministradorComponent } from './buscar-administrador/buscar-administrador.component';

@NgModule({
  declarations: [
    AppComponent,
    CrearAdministradorComponent,
    DetalleAdministradorComponent,
    ListaAdministradorComponent,
    BuscarAdministradorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
