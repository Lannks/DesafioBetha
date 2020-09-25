import { PipeTransform, Pipe } from '@angular/core';

@Pipe({
    name: 'filtro',
    pure: false
})
export class MyFilterPipe implements PipeTransform {
    transform(items: any[], filtro: (item: any) => boolean): any {
        if (!items || !filtro) {
            return items;
        }
        return items.filter(item => filtro(item));
    }
}